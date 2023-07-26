package ResponseTimeValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class ResponstimeValidation {
	
	@Test
	public void addProject() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
		//create the body
		given()
		.body(fis)
		.contentType(ContentType.JSON)
		.baseUri("http://rmgtestingserver")
		.port(8084);
		
		//send the request
		when()
		.post("/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(1000L),TimeUnit.MILLISECONDS);
		
		
		
		
	}

}
