package Parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetuserUsingQueryParameter {
	
	
	
	
	@Test
	public void getUser()
	{
		given()
		.queryParam("page", 2)
		.get("https://reqres.in/api/users")
		.then()
		.assertThat()
		.statusCode(200)
		.log()
		.all();
		
		
		
	}

}
