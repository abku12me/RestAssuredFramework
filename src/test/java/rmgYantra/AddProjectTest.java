package rmgYantra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	
	
	@Test
	public void addProject() throws FileNotFoundException
	{
		
		Random ran=new Random();
		int random=ran.nextInt();
		
	//create the json body
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
		RequestSpecification req = RestAssured.given();
		req.body(fis);
		req.contentType(ContentType.JSON);
		
	    //send the request
		Response resp = req.post("http://rmgtestingserver:8084/addProject");
		
		int statuscode=resp.getStatusCode();
		System.out.println(statuscode);
		
		//validate the response
		ValidatableResponse validateresp = resp.then();
		validateresp.assertThat().contentType(ContentType.JSON);
		validateresp.assertThat().statusCode(statuscode);
		validateresp.log().all();
		
		
		
	}
	
	

}
