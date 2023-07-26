package rmgYantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;

public class DeleteProjectTest {
	
	@Test
	public void deleteProject()
	{
		
		//send the request
		RequestSender req = RestAssured.when();
		Response resp = req.delete("http://rmgtestingserver:8084/projects/TY_PROJ_10476");
		
		System.out.println(resp.getStatusCode());
		
		//validate the response
		ValidatableResponse validate = resp.then();
		validate.assertThat().statusCode(204);
		
		
		
		
	}

}
