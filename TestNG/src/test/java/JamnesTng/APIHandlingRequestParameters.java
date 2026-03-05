package JamnesTng;

import org.testng.annotations.Test;

import io.restassured.http.Headers;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class APIHandlingRequestParameters {
	
	@Test
	public void QueryParameters() {
		
		given()
			.baseUri("https://dummyjson.com")
			.param("q","kiwi").
		when()
			.get("/products/search").
		then()
			.log().all()
			.statusCode(200);
	}
	
	@Test
	public void PathParametes() {
		
		given()
			.baseUri("https://dummyjson.com")
			.pathParam("id",101).
		when()
			.get("/products/{id}").
		then()
			.log().all()
			.statusCode(200);
	}
	
	@Test
	public void getHeader() {
		
		Headers header = given()
		.baseUri("https://dummyjson.com")
		.pathParam("id",101).
	when()
		.get("/products/{id}").
	then()
		.statusCode(200)
		.extract().headers();
		
		System.out.println(header.getValue("Content-Encoding"));
		System.out.println(header.getValue("Server"));
	}
	
	@Test
	public void getResponseHeader() {
		
		given()
		.baseUri("https://dummyjson.com")
		.pathParam("id",101).
	when()
		.get("/products/{id}").
	then()
		.statusCode(200)
		.header("Server","cloudflare");
	}
	
	@Test
	public void getCookies() {
		
		Map <String,String> cookies =given()
		.baseUri("https://dummyjson.com")
		.pathParam("id",1).
	when()
		.get("/products/{id}").
	then()
		.statusCode(200)
		.extract().cookies();
		
		cookies.forEach((key,value)->
			System.out.println("cookie name : " +key+ "Value : "+value));
	}
}
