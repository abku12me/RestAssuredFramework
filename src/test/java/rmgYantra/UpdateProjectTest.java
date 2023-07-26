package rmgYantra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	
	@Test
	public void UpdateProject() throws FileNotFoundException
	{
		//create the json body
		    JSONObject obj=new JSONObject();
		    obj.put("createdBy", "Abhishek");
		    obj.put("projectName", "VtTiger");
		    obj.put("status", "Created");
		    obj.put("teamSize", 4);
		    RequestSpecification req = RestAssured.given();
		    req.body(obj);
			req.contentType(ContentType.JSON);
			
	    //send the request
			Response resp = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_10476");
			System.out.println(resp.getStatusCode());
			
			
			//validate the response
			ValidatableResponse validate = resp.then();
			validate.assertThat().statusCode(200);
			validate.assertThat().contentType(ContentType.JSON);
			
			
			
			
			
			
		
		
		
	}

}
