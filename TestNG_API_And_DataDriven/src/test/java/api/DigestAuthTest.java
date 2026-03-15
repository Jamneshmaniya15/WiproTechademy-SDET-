package api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class DigestAuthTest {

	@Test
	public void digrdtAuth() {
		given()
			.baseUri("https://postman-echo.com")
			.auth().digest("postman", "password").
		when()
			.get("/digest-auth").
		then()
			.log().all()
			.statusCode(200);
	}
	
	
}
