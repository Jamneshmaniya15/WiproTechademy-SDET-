package daily_Assessment;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;

public class Day27OAuthApiTest {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://example.com";

        Response tokenResponse = RestAssured
            .given()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .formParam("clientId",     "your-client-id")
                .formParam("clientSecret", "your-client-secret")
            .when()
                .post("/oauth/token")
            .then()
                .statusCode(200)
                .extract().response();


        JsonObject tokenJson = JsonParser.parseString(tokenResponse.getBody().asString()).getAsJsonObject();
        String accessToken = tokenJson.get("access_token").getAsString();

        assert accessToken != null && !accessToken.isEmpty() : "access_token is missing!";
        System.out.println("Extracted access_token: " + accessToken);


        Response reportsResponse = RestAssured
            .given()
                .header("Authorization", "Bearer " + accessToken)
            .when()
                .get("/api/reports")
            .then()
                .statusCode(200)
                .extract().response();

        long responseTime = reportsResponse.getTime();
        assert responseTime < 3000 : "Response time exceeded 3 seconds: " + responseTime + "ms";
        System.out.println("Response Time: " + responseTime + "ms");


        List<Object> reports = reportsResponse.jsonPath().getList("$");
        assert reports != null && !reports.isEmpty() : "Reports array is empty or null!";
        System.out.println("Total reports: " + reports.size());


        String id   = reportsResponse.jsonPath().getString("[0].id");
        String name = reportsResponse.jsonPath().getString("[0].name");

        assert id   != null && !id.isEmpty()   : "id field missing in report!";
        assert name != null && !name.isEmpty() : "name field missing in report!";

        System.out.println("First report id: "   + id);
        System.out.println("First report name: " + name);
        System.out.println("All steps passed successfully!");
    }
}