package GetAllProjectsAPITestcase;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetAllProjectsTest {
	
	
	
	@Test
	public void getAllProject()
	{
		//send the request
		when()
		.get("http://rmgtestingserver:8084/projects")
		
		//validate
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();	
	}
	
	
	
	
	@Test
	public void getAllProjectwithDifferentEndPoint()
	{
		//send the request
		when()
		.get("http://rmgtestingserver:8084/project")
		
		//validate
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();	
	}
	
	
	@Test
	public void getAllProjectwithBody()
	{
		//create the body
		
		 
		
		//send the request
		when()
		.get("http://rmgtestingserver:8084/project")
		
		//validate
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();	
	}
	
	
	

}
