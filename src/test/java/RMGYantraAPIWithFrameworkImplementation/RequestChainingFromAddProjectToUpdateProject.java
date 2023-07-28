package RMGYantraAPIWithFrameworkImplementation;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.SpecificationBuilder;

public class RequestChainingFromAddProjectToUpdateProject extends SpecificationBuilder{

	@Test
	public void FromAddProjectToGetSingleProject() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
	    Response resp = given()
	    .spec(requestspe)
	    .body(fis)
	    .post(Endpoint.addproject);
	    String pID=resp.jsonPath().get(".projectId");
	    
	      given()
	      .pathParam("projectId", pID)
	      .put(Endpoint.updateProject)
	      .then()
	      .assertThat()
	      .statusCode(200)
	      .log()
	      .all();
	
	}
	
}
