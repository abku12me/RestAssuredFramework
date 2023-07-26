package DifferentTypeOFPath;

import static  io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectUsingHashMap {
	
	
	
	
	@Test
	public void addProject()
	{
		HashMap map=new HashMap();
		
		map.put("createdBy", "Vish");
		map.put("projectName", "PGHf");
		map.put("status", "Created");
		map.put("teamSize", 3);
		
		given()
	    .body(map)
	    .contentType(ContentType.JSON)
	    .when()
	    .post("http://rmgtestingserver:8084/addProject")
	    .then()
		.assertThat().statusCode(201)
		.log()
		.all();
		
		
		
	}

}
