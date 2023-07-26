package AddProjectAPITestcase;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithStatusTest {
	
	
	
	@Test
	public void addProjectWithStatus() throws FileNotFoundException
	{
		//create the body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\status.json");
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
	public void addProjectWithinvalidStatus1() throws FileNotFoundException
	{
		//create the body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\status1.json");
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
	public void addProjectWithinvalidStatus2() throws FileNotFoundException
	{
		//create the body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\status2.json");
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
