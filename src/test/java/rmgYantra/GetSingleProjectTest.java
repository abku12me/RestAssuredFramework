package rmgYantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;

public class GetSingleProjectTest {
	
	
	@Test
	public void getSingleProject()
	{
		
		//send the request
		 RequestSender req = RestAssured.when();
		 Response response = req.get("http://rmgtestingserver:8084/projects/TY_PROJ_10476");
		 System.out.println(response.getStatusCode());
		 System.out.println(response);
		 
		 //validate the response
		 ValidatableResponse validate = response.then();
		 validate.assertThat().statusCode(200);
		
	}

}
