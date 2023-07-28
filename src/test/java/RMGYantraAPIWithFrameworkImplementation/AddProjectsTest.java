package RMGYantraAPIWithFrameworkImplementation;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.SpecificationBuilder;

public class AddProjectsTest extends SpecificationBuilder{
	
	@Test
	public void addProjectWithSpecificationBuilder() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
	    given()
	    .spec(requestspe)
	    .body(fis)
	    .post(Endpoint.addproject)
	    .then()
	    .assertThat()
	    .statusCode(201)
	    .log().all();
	
	}
	
	
	
	
}
