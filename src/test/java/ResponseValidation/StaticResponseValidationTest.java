package ResponseValidation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationTest {
	
	@Test
	public void getAllProject()
	{
		String exptId="DP#007278";
		String actualid = when()
		.get("http://rmgtestingserver:8084/projects")
		.jsonPath()
		.get("[1].projectId");
		Assert.assertEquals(actualid,exptId);
		Reporter.log("validated successful",true);
	
	}
	
	
	

}
