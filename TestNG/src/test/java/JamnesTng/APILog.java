package JamnesTng;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class APILog {

	
	@Test
	public void logAll() {
		
		given()
			.baseUri("https://dummyjson.com").
		when()
			.get("/products/1").
		then()
			.log().all();
			//.log().everything();
		
	}
	
	@Test
	public void LogBodyHeader() {
		
		given()
			.baseUri("https://dummyjson.com").
		when()
			.get("/products/1").
		then()
			//.log().body()
			.log().headers();
	}
	
	@Test
	public void LogCookiesStatus() {
		
		given()
			.baseUri("https://dummyjson.com").
		when()
			.get("/products/1").
		then()
			.log().status();
			//.log().cookies();
	}
	
	@Test
	public void LogIfError() {
		
		given()
			.baseUri("https://dummyjson.com").
		when()
			.get("/products/500").
		then()
			.log().ifError();
	}
	
	@Test
	public void LogIfValidationFails() {
		
		given()
			.baseUri("https://dummyjson.com").
		when()
			.get("/products/500").
		then()
			.log().ifValidationFails()
			.statusCode(404);
	}
	
}
