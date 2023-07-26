package AddProjectAPITestcase;

import static io.restassured.RestAssured.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithCreatedByTest {
	
	
	
	@Test
	public void addProjectWithCreatedBydata() throws FileNotFoundException
	{
		//create the body
				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\created1.json");
				given()
				.body(fis)
				.contentType(ContentType.JSON);
				
				//send the request
				when()
				.post("http://rmgtestingserver:8084/addProject")
				
				
				//validate the response
				.then()
				.assertThat().statusCode(201)
				.log()
				.all();
		
	}
	
	
	@Test
	public void addProjectWithCreatedBy() throws FileNotFoundException
	{
		//create the body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\created.json");
		given()
		.body(fis)
		.contentType(ContentType.JSON);
		//send the request
		
		when()
		.post("http://rmgtestingserver:8084/addProject")
		
		
		//validate the response
		.then()
		.assertThat().statusCode(201)
		.log()
		.all();
	}
	
	
	@Test
	public void addProjectWithInvalidCreatedBy() throws FileNotFoundException
	{
		
		//create the body
				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\created2.json");
				given()
				.body(fis)
				.contentType(ContentType.JSON);
				
				//send the request
				when()
				.post("http://rmgtestingserver:8084/addProject")
				
				
				//validate the response
				.then()
				.assertThat().statusCode(201)
				.log()
				.all();
		
	}
	
	

}
