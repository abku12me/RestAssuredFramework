package DifferentTypeOFPath;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectUsingJsonObject {
	
	
	
	@Test
	public void addProject()
	{
		JSONObject obj=new JSONObject();
	    obj.put("createdBy", "Vish");
	    obj.put("projectName", "PGHf");
	    obj.put("status", "Created");
	    obj.put("teamSize", 3);
	    
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON)
	    .when()
	    .post("http://rmgtestingserver:8084/addProject")
	    .then()
		.assertThat().statusCode(201)
		.log()
		.all();
	    
	    
		
		
		
	}

}
