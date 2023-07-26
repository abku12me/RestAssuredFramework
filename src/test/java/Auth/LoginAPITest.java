package Auth;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class LoginAPITest {
	
	
	
	@Test
	public void login()
	{
		//pre-condition
		
		given()
		.auth()
		//.oauth2(DEFAULT_BODY_ROOT_PATH)
		.basic("rmgyantra", "rmgy@9999")
		
		//send the request
		.when()
		.get("http://rmgtestingserver:8084/login")
		
		//validate the response
		.then()
		.assertThat().statusCode(202)
		.log()
		.all();
	}
	
	
	@Test
	public void preemptiveAuthTest()
	{
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.get("http://rmgtestingserver:8084/login")
		.then()
		.assertThat()
		.statusCode(202)
		.log()
		.all();
			
	}
	
	
	@Test
	public void digestAuthTest()
	{
		given()
		.auth()
		.digest("rmgyantra", "rmgy@9999")
		.get("http://rmgtestingserver:8084/login")
		.then()
		.assertThat()
		.statusCode(202)
		.log()
		.all();
	}
	
	
	
	
	

}
