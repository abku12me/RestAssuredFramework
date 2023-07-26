package Parameter;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameter {
	
	@Test
	public void getSingleProject()
	{
		
		//path parameter
		
		given()
		.pathParam("projectid","TY_PROJ_10487");
		
		//send the request
		when()
		.get("http://rmgtestingserver:8084/projects/{projectid}")
		
		//validate the response
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();
		
	}
	
	

}
