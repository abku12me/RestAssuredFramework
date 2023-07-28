package RMGYantraAPIWithFrameworkImplementation;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.IConstantUtilities;
import transsoft.GenericUtility.SpecificationBuilder;

public class UpdateProjectTest extends SpecificationBuilder{
	
	@Test
	public void updateProject() throws EncryptedDocumentException, IOException
	{
		String projectID=eutil.readDataFromExcelsheet(IConstantUtilities.excelpath, "ProjectId", 1, 1);
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.json");
	    given()
	    .spec(requestspe)
	    .body(fis)
	    .pathParam("projectId", projectID)
	    .when()
	    .put(Endpoint.updateProject)
	    .then()
	    .assertThat()
	    .statusCode(200)
	    .log()
	    .all();
	}

}
