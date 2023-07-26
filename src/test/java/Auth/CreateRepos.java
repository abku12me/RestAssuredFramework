package Auth;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateRepos {
	
	
	@Test
	public void createRepos()
	{
		
		//create the body along with authentication
		
		HashMap map=new HashMap();
		map.put("name", "GTApp");
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.auth()
		.oauth2("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")
		
		//send the request
		.post("https://api.github.com/user/repos")
		
		//validate the response
		.then()
		.assertThat().statusCode(201)
		.log()
		.all();
				
	}
	
	

}
