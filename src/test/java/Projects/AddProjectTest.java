package Projects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import transsoft.GenericUtility.BaseClass;
import transsoft.GenericUtility.IConstantUtilities;
import transsoft.ObjectRepository.CreateProjectPage;
import transsoft.ObjectRepository.HomePage;

public class AddProjectTest extends BaseClass{
	
	
	
	@Test
	public void createProject() throws EncryptedDocumentException, IOException
	{
		//Read data from the excel sheet
		
		String projectname=eutil.readDataFromExcelsheet(IConstantUtilities.excelpath, "Projects", 1, 0)+jutil.getRandom();
		String CreatedBy=eutil.readDataFromExcelsheet(IConstantUtilities.excelpath, "Projects", 1, 2);
		
		
		//click on project
		HomePage hp=new HomePage(driver);
		hp.clickOnProject();
		
		//click on createProject
		wutil.scrollWindow(driver);
		hp.clickOncfeateProject();
		
		
		//create project with all the manadatory field
		CreateProjectPage cp=new CreateProjectPage(driver);
		cp.createProject(driver, projectname, CreatedBy);
		
		//validate project is created or not
		
		String expextRes=projectname;
		
      String actual=hp.validateProject(driver, projectname);
        Assert.assertTrue(expextRes.contains(actual),"Project not been validated");
       Reporter.log("project created successfully",true);
	}

}
