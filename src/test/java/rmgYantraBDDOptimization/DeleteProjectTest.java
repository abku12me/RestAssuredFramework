package rmgYantraBDDOptimization;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class DeleteProjectTest {
	
	
	@Test
	public void deleteProject()
	{
		
		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_10476")
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();
		
	}

}
