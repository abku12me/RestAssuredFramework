package rmgYantraBDDOptimization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjectsTest {
	
	@Test
	public void getAllProjects()
	{
		when()
		.get("http://rmgtestingserver:8084/projects")
		.then()
		.assertThat().statusCode(200);
		
		
		
	}
	
	
	

}
