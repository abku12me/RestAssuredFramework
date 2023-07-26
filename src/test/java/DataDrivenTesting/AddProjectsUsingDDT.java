package DataDrivenTesting;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import pojo.genericUtility.AddProjectPojo;
import transsoft.GenericUtility.ExcelsheetUtilities;
import transsoft.GenericUtility.JavaUtility;


public class AddProjectsUsingDDT {
	JavaUtility jutil=new JavaUtility();
	ExcelsheetUtilities eutil=new ExcelsheetUtilities();
	
	@Test(dataProvider="getdata")
	public void addProjectUsingDataProvider(Object createdBy,Object projectName,Object status,Object teamSize ) throws FileNotFoundException
	{
		int ran=jutil.getRandom();
		AddProjectPojo proj=new AddProjectPojo(createdBy,projectName.toString()+ran,status,teamSize);
		
		given()
		.body(proj)
		.contentType(ContentType.JSON)
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.log()
		.all();
	
	}
	
	@DataProvider(name="getdata")
	public Object[][] addProjectWithMultipledata() throws EncryptedDocumentException, IOException
	{
		Object[][] data=eutil.getMultipleData("Sheet1");
		return data;
	}
	
	
	
	

}
