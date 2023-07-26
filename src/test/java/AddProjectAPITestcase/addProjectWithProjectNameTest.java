package AddProjectAPITestcase;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class addProjectWithProjectNameTest {
	
	
	
	@Test
	public void addProjectWithProjectName() throws FileNotFoundException
	{
		//create the body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\projectname.json");
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
	public void addProjectWithinvalidProjectName() throws FileNotFoundException
	{
		//create the body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\projectname1.json");
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
