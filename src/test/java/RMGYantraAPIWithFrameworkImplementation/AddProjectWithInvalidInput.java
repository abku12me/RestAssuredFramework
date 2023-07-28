package RMGYantraAPIWithFrameworkImplementation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.SpecificationBuilder;

import static io.restassured.RestAssured.*;

public class AddProjectWithInvalidInput extends SpecificationBuilder{
	
	
	
	@Test
	public void addProjectWithInvalidInput()
	{
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "abhishek");
		obj.put("projectName", "GTManage"+jutil.getRandom());
		obj.put("status", "Createds");
		obj.put("teamSize", -9);
		
		given()
		.spec(requestspe)
		.post(Endpoint.addproject)
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
	}

}
