package DeleteProjectAPITestcase;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class deleteProjectTest {
	
	@Test
	public void deleteProject()
	{
		//send the request
		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_10476")
		
		//validate the response
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();	
	}
	
	
	@Test
	public void deleteProjectWithInvalidEndpoint()
	{
		//send the request
		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_476")
		
		//validate the response
		.then()
//		.assertThat()
//		.statusCode(204)
		.log()
		.all();	
	}
	
	
	
	
	

}
