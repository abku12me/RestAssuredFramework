package RMGYantraAPIWithFrameworkImplementation;

import static io.restassured.RestAssured.when;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.IConstantUtilities;
import transsoft.GenericUtility.SpecificationBuilder;

public class GetSingleProjectTest extends SpecificationBuilder{
	
	@Test
	public void getSingleProject() throws EncryptedDocumentException, IOException
	{
		String projectID=eutil.readDataFromExcelsheet(IConstantUtilities.excelpath, "ProjectId", 1, 1);
		
		given()
		.pathParam("projectId", projectID)
		.when()
		.get(Endpoint.getSingleProject)
		.then()
		.assertThat().statusCode(200)
		.log()
		.all();
	    
		
	}
	
	

}
