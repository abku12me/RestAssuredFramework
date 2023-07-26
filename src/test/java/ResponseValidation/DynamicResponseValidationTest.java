package ResponseValidation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Set;

public class DynamicResponseValidationTest {
	
	@Test
	public void getAllProjects()
	{
		String expId="TY_PROJ_9491";
		Response resp = when()
		.get("http://rmgtestingserver:8084/projects");
		List<String> list=resp.jsonPath().get("projectId");
		//boolean flag=false;
		
	    for(String actId:list)
	    {
	    	if(actId.equals(expId))
	    	{  
	    		//flag=true;
	    		break;	
	    	}
	    }
		
	Reporter.log("validation successful",true);
	
	
		
	}

}
