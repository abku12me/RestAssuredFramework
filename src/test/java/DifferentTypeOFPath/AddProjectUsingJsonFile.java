package DifferentTypeOFPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectUsingJsonFile {
	
	
	
	@Test
	public void addProject() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
		given()
		.body(fis)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
	}

}
