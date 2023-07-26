package Auth;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OauthWithCoopApp {
	
	@Test
	public void coopToken()
	{
	 Response resp = given()
		.formParam("client_id", "SDET49")
		.formParam("client_secret", "ed19a7694116925229b200828925ed9d")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://www.example.com")
		.formParam("code", "4620")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
	   String token=resp.jsonPath().get("access_token");
	   System.out.println(token);
		   given()
		   .pathParam("code", token)
		   .get("http://coop.apps.symfonycasts.com/authorize")
		.then()
		.log()
		.all();
		
	}

}
