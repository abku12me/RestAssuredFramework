package ResponseBodyValidate;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import transsoft.GenericUtility.Endpoint;

public class StatusLineValidationTest {
	
	
	@Test
	public void statusLineValidation()
	{
		
		String exptstatusline="HTTP/1.1 200 ";
		Response resp = given()
				.get(Endpoint.getAllProject);
		
		System.out.println(resp.getBody().prettyPrint());
		
		String Vary = resp.getHeader("Vary");
		System.out.println(Vary);
		Headers head = resp.getHeaders();
		System.out.println(head);
		String actualstatusline=resp.getStatusLine();
		Assert.assertEquals(exptstatusline, actualstatusline);
		
		
		
	}
	

}
