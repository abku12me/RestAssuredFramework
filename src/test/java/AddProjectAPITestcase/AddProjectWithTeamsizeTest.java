package AddProjectAPITestcase;
import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithTeamsizeTest {
	
	
	
	
	@Test
	public void addProjectWithTeamsize() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\team.json");
		given()
		.body(fis)
		.contentType(ContentType.JSON);
		//send the request
		
		when()
		.post("http://rmgtestingserver:8084/addProject")
		
		
		//validate the response
		.then()
		.assertThat().statusCode(201)
		.log()
		.all();
		
	}
		
	@Test
	public void addProjectWithinvalidTeamsize1() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\team1.json");
		given()
		.body(fis)
		.contentType(ContentType.JSON);
		//send the request
		
		when()
		.post("http://rmgtestingserver:8084/addProject")
		
		
		//validate the response
		.then()
		.assertThat().statusCode(201)
		.log()
		.all();
	
	}	
	
	
	
	@Test
	public void addProjectWithinvalidTeamsize2() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\team2.json");
		given()
		.body(fis)
		.contentType(ContentType.JSON);
		//send the request
		
		when()
		.post("http://rmgtestingserver:8084/addProject")
		
		
		//validate the response
		.then()
		.assertThat().statusCode(201)
		.log()
		.all();
	
	}	

		
		
	}


