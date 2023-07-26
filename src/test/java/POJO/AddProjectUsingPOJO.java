package POJO;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojo.genericUtility.AddProjectPojo;

public class AddProjectUsingPOJO {
	

	
	@Test
	public void addProject()
	{
		AddProjectPojo app=new AddProjectPojo("Abhishek","Data1","Created",23);
		given()
	    .body(app)
	    .contentType(ContentType.JSON)
	    .when()
	    .post("http://rmgtestingserver:8084/addProject")
	    .then()
		.assertThat().statusCode(201)
		.log()
		.all();
		
		
	}

}
