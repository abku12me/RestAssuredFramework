package ResponseBodyValidate;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import transsoft.GenericUtility.Endpoint;

import static io.restassured.RestAssured.*;


public class ResponseBodyValidation {
	
	
	
	@Test
	public void responseBodyMethods()
	{
		Response resp = given()
		.get(Endpoint.getAllProject);
		
//	ResponseBody body = resp.getBody();
//	System.out.println(body);//it will print the address
		
		ResponseBody responseBodybody = resp.body();
//		System.out.println(body);  //it will print the address same as getBody
//		String type = resp.getContentType();  //content type of the response
//		System.out.println(type);
		
//		String body=resp.body().asString();
//		System.out.println(body);// asStrong comes from rest assured that get the body in the form of string
//		
//		Headers vary = resp.getHeaders();
//		System.out.println(vary);    //it will print all the header of the request
		
//		String pretty = responseBodybody.prettyPrint();
//		System.out.println(pretty);// it will print only the response body
		
	ResponseBody peek = responseBodybody.prettyPeek();
		System.out.println(peek); // 
	
		
		
		
		
		
		
	}
	

}
