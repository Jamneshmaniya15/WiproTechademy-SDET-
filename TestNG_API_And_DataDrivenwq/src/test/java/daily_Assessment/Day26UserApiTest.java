package daily_Assessment;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Day26UserApiTest {

    public static void main(String[] args) throws Exception {

        RestAssured.baseURI = "https://example.com";
        ObjectMapper mapper = new ObjectMapper();

        // Step 1: Register user
        String registerBody = """
            {
                "name": "John Doe",
                "email": "johndoe@example.com",
                "password": "Password@123"
            }
            """;

        Response registerResponse = RestAssured
            .given()
                .header("Content-Type", "application/json")
                .body(registerBody)
            .when()
                .post("/api/register")
            .then()
                .statusCode(201)
                .extract().response();

        System.out.println("Register Response: " + registerResponse.getBody().asString());

        // Step 2: Extract token using Jackson
        JsonNode registerJson = mapper.readTree(registerResponse.getBody().asString());
        String accessToken = registerJson.get("accessToken").asText();
        String userId      = registerJson.get("userId").asText();

        assert accessToken != null && !accessToken.isEmpty() : "accessToken is missing!";
        assert userId      != null && !userId.isEmpty()      : "userId is missing!";
        System.out.println("Extracted Token: " + accessToken);

        // Step 3: Fetch profile using GET (validate response time < 3 seconds)
        Response profileResponse = RestAssured
            .given()
                .header("Authorization", "Bearer " + accessToken)
            .when()
                .get("/api/profile")
            .then()
                .statusCode(200)
                .extract().response();

        long responseTime = profileResponse.getTime();
        assert responseTime < 3000 : "Response time exceeded 3 seconds: " + responseTime + "ms";
        System.out.println("GET Profile Response (" + responseTime + "ms): " + profileResponse.getBody().asString());

        // Validate profile fields
        JsonNode profileJson = mapper.readTree(profileResponse.getBody().asString());
        assert profileJson.has("name")   : "name field missing in profile!";
        assert profileJson.has("email")  : "email field missing in profile!";
        assert profileJson.has("userId") : "userId field missing in profile!";

        // Step 4: Update profile using PUT
        String updateBody = """
            {
                "name": "Updated Name"
            }
            """;

        Response updateResponse = RestAssured
            .given()
                .header("Authorization", "Bearer " + accessToken)
                .header("Content-Type", "application/json")
                .body(updateBody)
            .when()
                .put("/api/profile")
            .then()
                .statusCode(200)
                .extract().response();

        System.out.println("PUT Update Response: " + updateResponse.getBody().asString());

        // Step 5: Validate responses
        JsonNode updateJson = mapper.readTree(updateResponse.getBody().asString());
        String updatedName = updateJson.get("name").asText();
        assert "Updated Name".equals(updatedName) : "Name was not updated! Got: " + updatedName;

        System.out.println("All steps passed successfully!");
    }
}