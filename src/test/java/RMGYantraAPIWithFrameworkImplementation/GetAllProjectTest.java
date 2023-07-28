package RMGYantraAPIWithFrameworkImplementation;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.SpecificationBuilder;

public class GetAllProjectTest extends SpecificationBuilder {
	
	@Test
	public void getAllProjects()
	{
		when()
		.get(Endpoint.getAllProject)
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		
	}
	
	
	

}
