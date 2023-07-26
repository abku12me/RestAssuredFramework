package Parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class AddProjectUsingFormParameter {
	
	
	
	@Test
	public void addProject()
	{
		given()
		.formParam("Created", "Abhishek")
		.formParam("projectNmae", "GT Manage")
		.formParam("status", "Created")
		.formParam("teamSize", 3)
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.log()
		.all();
	
		
		
	}

}
