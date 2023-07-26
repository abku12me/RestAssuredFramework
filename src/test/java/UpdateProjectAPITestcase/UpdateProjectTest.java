package UpdateProjectAPITestcase;
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
	    
	    //create the body
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON);
	    
	    //send the request
	    when()
	    .put("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
	    
	    //validate the resaponse
	    .then()
	    .assertThat()
	    .statusCode(200)
	    .log()
	    .all();	
	}
	
	
	
	@Test
	public void updateProjectWithInvalidData1()
	{
		JSONObject obj=new JSONObject();
	    obj.put("createdBy", "Avinash");
	    obj.put("projectName", "Transsoft");
	    obj.put("status", "Completed");
	    obj.put("teamSize", -9);
	    
	    //create the body
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON);
	    
	    //send the request
	    when()
	    .put("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
	    
	    //validate the resaponse
	    .then()
//	    .assertThat()
//	    .statusCode(200)
	    .log()
	    .all();	
	}
	
	
	@Test
	public void updateProjectWithInvalidData2()
	{
		JSONObject obj=new JSONObject();
	    obj.put("createdBy", "Avinash");
	    obj.put("projectName", "Transsoft54645343");
	    obj.put("status", "Completed");
	    obj.put("teamSize", 8);
	    
	    //create the body
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON);
	    
	    //send the request
	    when()
	    .put("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
	    
	    //validate the resaponse
	    .then()
//	    .assertThat()
//	    .statusCode(200)
	    .log()
	    .all();	
	}
	
	
	@Test
	public void updateProjectWithInvalidData3()
	{
		JSONObject obj=new JSONObject();
	    obj.put("createdBy", "Avinash");
	    obj.put("projectName", "Transsoft54645343");
	    obj.put("status", "Completed");
	    obj.put("teamSize", 834546);
	    
	    //create the body
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON);
	    
	    //send the request
	    when()
	    .put("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
	    
	    //validate the resaponse
	    .then()
//	    .assertThat()
//	    .statusCode(200)
	    .log()
	    .all();	
	}
	
	
	
	@Test
	public void updateProjectWithInvalidData4()
	{
		JSONObject obj=new JSONObject();
	    obj.put("createdBy", "Avinash");
	    obj.put("projectName", "Transsoft54645343");
	    obj.put("status", "Completed");
	    obj.put("teamSize", "834546Abhishek");
	    
	    //create the body
	    given()
	    .body(obj)
	    .contentType(ContentType.JSON);
	    
	    //send the request
	    when()
	    .put("http://rmgtestingserver:8084/projects/TY_PROJ_10487")
	    
	    //validate the resaponse
	    .then()
//	    .assertThat()
//	    .statusCode(200)
	    .log()
	    .all();	
	}
	

	

}
