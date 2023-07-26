package rmgYantraBDDOptimization;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleProjectTest {
	
	@Test
	public void getSingleProject()
	{
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();
	    
		
	}

}
