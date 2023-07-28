package transsoft.GenericUtility;

import java.sql.Connection;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SpecificationBuilder {
	
	public ExcelsheetUtilities eutil=new ExcelsheetUtilities();
	public JavaUtility jutil=new JavaUtility();
	
	public RequestSpecification requestspe;
	
	public ResponseSpecification responsespe;
	//This will provide common specification for request api
	@BeforeSuite
	public void  bsConfig()
	{
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri(IConstantUtilities.URI);
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		
		 requestspe = builder.build();
		
	
	////This will provide common specification for request api
		ResponseSpecBuilder builder1=new ResponseSpecBuilder();
		builder1.expectStatusCode(201);
		//builder1.expectContentType(ContentType.JSON);
		//builder1.expectResponseTime(Matchers.)
		//builder1.expectStatusLine("HTTP/1:1 409");
		responsespe = builder1.build();
	}
	
	
	

}
