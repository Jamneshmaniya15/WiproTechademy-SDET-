package daily_Assessment;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Day28OrderApiTest {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://example.com";

        // Create order
        String requestBody = "{ \"productName\": \"Laptop\", \"quantity\": 2 }";

        Response createResponse = RestAssured
            .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
            .when()
                .post("/api/orders")
            .then()
                .statusCode(201)
                .extract().response();

        // Extract orderId
        JsonObject createJson = JsonParser.parseString(createResponse.getBody().asString()).getAsJsonObject();
        String orderId = createJson.get("orderId").getAsString();
        System.out.println("Extracted orderId: " + orderId);

        // Fetch order details using GET and query params
        Response getResponse = RestAssured
            .given()
                .pathParam("orderId", orderId)
                .queryParam("includeDetails", true)
            .when()
                .get("/api/orders/{orderId}")
            .then()
                .statusCode(200)
                .extract().response();

        // Validate response time
        long responseTime = getResponse.getTime();
        assert responseTime < 3000 : "Response time exceeded 3 seconds: " + responseTime + "ms";

        // Validate JSON fields using JsonPath
        String productName = getResponse.jsonPath().getString("productName");
        int    quantity    = getResponse.jsonPath().getInt("quantity");

        assert "Laptop".equals(productName) : "productName mismatch!";
        assert quantity == 2                : "quantity mismatch!";

        System.out.println("productName: " + productName);
        System.out.println("quantity: "    + quantity);
        System.out.println("All steps passed successfully!");
    }
}