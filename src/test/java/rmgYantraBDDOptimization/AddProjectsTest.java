package rmgYantraBDDOptimization;

import static io.restassured. RestAssured.*;// making import as static we can call

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.SpecificationBuilder;

public class AddProjectsTest extends SpecificationBuilder{
	
	@Test
	public void addProjects() throws FileNotFoundException
	{
		//create the json body
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
		given()
		.body(fis)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
	
	
	
	@Test
	public void addProjectWithSpecificationBuilder() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
	    given()
	    .spec(requestspe)
	    .body(fis)
	    .post(Endpoint.addproject)
	    .then().log().all();
	    
	   
		
		
	}
	
	
	
	

}
