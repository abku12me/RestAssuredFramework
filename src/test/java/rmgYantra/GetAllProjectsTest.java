package rmgYantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;

public class GetAllProjectsTest {
	
	@Test
	public void getAllProjects()
	{
		
		//send the request
		RequestSender req = RestAssured.when();
		Response response = req.get("http://rmgtestingserver:8084/projects");
		System.out.println(response.getStatusCode());
		
		//validate the response
		ValidatableResponse validate = response.then();
		validate.assertThat().statusCode(200);
		
	}

}
