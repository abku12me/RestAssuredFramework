package GetSingleProjectAPITestcase;
import static io.restassured. RestAssured.*;

import org.testng.annotations.Test;
public class GetSingleProjectTest {
	
	
	
	@Test
	public void getSingleProject()
	{
		//send the request
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
		
		//validate the response
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();
	}
	
	@Test
	public void getSingleProjectwithinvalidprojectId()
	{
		//send the request
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_104347")
		
		//validate the response
		.then()
		//.assertThat().statusCode(200)
		.log()
		.all();
	}
	
	
	

}
