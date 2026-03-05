package JamnesTng;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APITest {

    @Test
    public void getUserTest() {

            given()
            	.baseUri("https://dummyjson.com").
            when()
            	.get("/products").
            then()
            	.statusCode(200);
    }
    
    @Test
    public void validateJsonResponse() {
    	
    	given()
    		.baseUri("https://dummyjson.com").
    	when()
    		.get("/products").
    	then()
    		.log().ifValidationFails()
    		.statusCode(200)
    		.body(
    			"products[0].id", equalTo(1),
    			"products[0].title",equalTo("Essence Mascara Lash Princess"),
    			"products[0].tags[0]",equalTo("beauty"),
    			"products[0].tags",hasItem("beauty"),
    			"products[0].dimensions.height",is(13.08f),
    			"products[0].reviews[1].reviewerName",equalTo("Lucas Gordon")
    			);
    }
    
    @Test
    public void ExtrateResponse() {
    	
    	Response res = given()
			    		.baseUri("https://dummyjson.com").
			    	when()
			    		.get("/products").
			    	then()
			    		.statusCode(200)
			    		.extract().response();
    				System.out.println(res);
    }
    
    @Test
    public void getAllProducts() {

            get("https://dummyjson.com/products")
            .then()
            .statusCode(200)
            .log().all();
    }
    
    @Test
    public void createProduct() {
    	
    	File file = new File("C:\\Users\\Jamnesh Maniya\\eclipse-workspace\\TestNG\\src\\Json\\data.json");
    	
    	given()
    	.baseUri("https://dummyjson.com/products")
    	.contentType(ContentType.JSON)
    	.body(file)
    	.when()
    	.post("/add")
    	.then()
    	.statusCode(201)
    	.log().all();
    }
    
    
}

