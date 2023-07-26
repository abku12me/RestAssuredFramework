package SwaggerRequestchaining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class PlacedanOrderForPet {
	
	
	
	@Test
	public void placedanOrderForPet() throws FileNotFoundException
	{
	     FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\post.json");
		  Response resp = given()
		  .body(fis)
		.contentType(ContentType.JSON)
		.post("https://petstore.swagger.io/v2/store/order");
	    
		  
		  //captuing the response
		  int orderID = resp.jsonPath().get("id");
		  given()
		  .pathParam("orderid", orderID)
		  
		  //used as a parameter in other request for purchase order id
//		  .get("https://petstore.swagger.io/v2/store/order/{orderid}")
//		  .then()
//		  .log()
//		  .all()
//		  .assertThat().statusCode(200);
//		  
		  
		//Delete the purchase order id
		  
		  .delete("https://petstore.swagger.io/v2/store/order/{orderid}")
		  .then()
		  .log()
		  .all();
		
		
	}

}
