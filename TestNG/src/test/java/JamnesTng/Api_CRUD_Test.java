package JamnesTng;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Api_CRUD_Test {
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
    				System.out.println("Values : "+res.asString());
    }
    
    
    @Test
    public void ExtractSingleValue() {
    	
    	String ans = given()
    			.baseUri("https://dummyjson.com").
    	when()
    		.get("/products").
    	then()
    		.statusCode(200)
    		.log().ifValidationFails()
	    	.body(
	    			"products[1].id", equalTo(2),
	    			"products[1].title",equalTo("Eyeshadow Palette with Mirror"),
	    			"products[1].tags[1]",equalTo("eyeshadow"),
	    			"products[1].dimensions.depth",equalTo(27.67f)
	    			)
	    	.extract().path("products[1].title");
    	
    	System.out.println("Title : "+ans);
    }
    
    @Test
    public void postRequestUsingObject() {
    	JSONObject body = new JSONObject();
    	body.put("title","pokemon");
    	body.put("price",269);
    	
    	int ans =given()
    			.baseUri("https://dummyjson.com")
    			.contentType(ContentType.JSON)
    			.body(body.toString()).
    		when()
    			.post("/products/add").
    		then()
    			.statusCode(201)
    			.body(
    					"title",equalTo("pokemon"))
    			.extract().path("price");
    	
    	System.out.println("Price : "+ans);
    }
    
    @Test
    public void postRequestUsingHashMap() {
    	Map <String,Object> body = new HashMap<>();
    	body.put("title", "Greninja");
    	body.put("price", 239482);
    	
    	
    	int ans = given()
    				.baseUri("https://dummyjson.com")
    				.contentType(ContentType.JSON)
    				.body(body).
    			when()
    				.post("/products/add").
    			then()
    				.statusCode(201)
    				.body("title", equalTo("Greninja"))
    				.extract().path("price");
    	
    	System.out.println("Greninja price : "+ans);
    }
    
    @Test
    public void putRequestUsingHashMap() {
    	Map <String,Object> body = new HashMap<>();
    	body.put("title", "Greninja");
    	body.put("price", 239482);
    	
    	
    			Response res =given()
    				.baseUri("https://dummyjson.com")
    				.contentType(ContentType.JSON)
    				.body(body).
    			when()
    				.put("/products/1").
    			then()
    				.statusCode(200)
    				.extract().response();
    			
    			String updatedTitle = res.jsonPath().getString("id");
    		    System.out.println("EXTRACTED TITLE: " + updatedTitle);
    		    
    		    System.out.println("new Values  : "+res.asPrettyString());
    			
    }
    
    @Test
    public void Delete() {
    	
    			Object res =given()
    				.baseUri("https://dummyjson.com")
    				.contentType(ContentType.JSON).
    			when()
    				.delete("/products/1").
    			then()
    				.statusCode(200)
    				.extract().path("isDeleted");
    			
    		    System.out.println(":Msg " + res);
    			
    }
    
}
