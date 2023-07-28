package RMGYantraAPIWithFrameworkImplementation;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.SpecificationBuilder;
import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class RequestingChainingFromAddProjectToDeleteProject extends SpecificationBuilder{

	@Test
	public void FromAddProjectToDeleteProject() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
	    Response resp = given()
	    .spec(requestspe)
	    .body(fis)
	    .post(Endpoint.addproject);
	    String pID=resp.jsonPath().get(".projectId");
	    
	    given()
	    .pathParam("projectId", pID)
	    .delete(Endpoint.deleteProject)
	    .then()
	    .assertThat()
	    .statusCode(204)
	    .log()
	    .all();
	
	}
	
}
