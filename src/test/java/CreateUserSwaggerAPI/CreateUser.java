package CreateUserSwaggerAPI;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import transsoft.GenericUtility.BaseClass;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CreateUser {
	
	
	@Test
	public void createUser() throws FileNotFoundException
	{
		FileInputStream fil=new FileInputStream(".\\src\\test\\resources\\user.json");
		given()
		.body(fil)
		.contentType(ContentType.JSON)
		.post("https://petstore.swagger.io/v2/user/createWithArray")
		
	
		.then()
		.log()
		.all();
		
		
		
		
	}
	
	
	@Test
	public void getUserByUserName()
	{
		
		given()
		.pathParam("username", "abhishek")
		.get("https://petstore.swagger.io/v2/user/{username}")
		.then()
		.log()
		.all();
			
	}
	
	
	
	
	
	

}
