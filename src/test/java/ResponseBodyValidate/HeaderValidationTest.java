package ResponseBodyValidate;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import transsoft.GenericUtility.Endpoint;

public class HeaderValidationTest {
	
	
	
	@Test
	public void headerValidation()
	{
		
		String expecContentType="application/json";
		String expectedVary="Access-Control-Request-Headers";
		String expectedPragma="no-cache";
		Response resp = given()
				.get(Endpoint.getAllProject);
		
		String actualvary = resp.getHeader("Vary");
		Assert.assertEquals(expectedVary, actualvary);
		
	String actualPrg = resp.getHeader("Pragma");
	Assert.assertEquals(expectedPragma, actualPrg);
	
	     String actualHeader = resp.contentType();
	     
	     Assert.assertEquals(expecContentType, actualHeader);
	     
	
		
		
		
	}

}
