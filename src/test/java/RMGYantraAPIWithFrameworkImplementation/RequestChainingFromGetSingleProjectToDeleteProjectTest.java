package RMGYantraAPIWithFrameworkImplementation;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.IConstantUtilities;
import transsoft.GenericUtility.SpecificationBuilder;
public class RequestChainingFromGetSingleProjectToDeleteProjectTest extends SpecificationBuilder {

	@Test
	public void FromAddProjectToGetSingleProject() throws EncryptedDocumentException, IOException
	{
         String projectID=eutil.readDataFromExcelsheet(IConstantUtilities.excelpath, "ProjectId", 1, 1);
		
		given()
		.pathParam("projectId", projectID)
		.when()
		.get(Endpoint.getSingleProject);
		
		when()
		.delete(Endpoint.deleteProject)
		.then()
		.assertThat()
		.statusCode(204)
		.log()
		.all();
	}

}
