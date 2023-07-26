package rmgYantraBDDOptimization;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectTest {
	
	
	@Test
	public void updateProject()
	{
		JSONObject obj=new JSONObject();
	    obj.put("createdBy", "Vis");
	    obj.put("projectName", "PGH");
	    obj.put("status", "Created");
	    obj.put("teamSize", 3);
	    
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON);
	    when()
	    .put("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
	    .then()
	    .assertThat()
	    .statusCode(200)
	    .log()
	    .all();
	    
		
		
		
	}

}
