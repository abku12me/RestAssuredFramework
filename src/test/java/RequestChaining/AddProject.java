package RequestChaining;


import static io.restassured. RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddProject {
	
	
	@Test
	public void addProject() throws FileNotFoundException
	{
		//create the json body
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
		 given()
		.body(fis)
		.contentType(ContentType.JSON);
	    
		
	//capturing the response
		RequestSender resp = when();
		Response resps = resp.post("http://rmgtestingserver:8084/addProject");
		String captureProjectid=resps.jsonPath().get(".projectId");
		System.out.println(captureProjectid);
		
		//used in other request
		given()
		.pathParam("pId", captureProjectid)
		.get("http://rmgtestingserver:8084/projects/{pId}")
		

		//validate the response
	    .then()
		.assertThat()
	    .statusCode(200)
		.log()
	    .all();
		
		
	}

}
