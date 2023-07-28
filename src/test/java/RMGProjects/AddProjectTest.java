package RMGProjects;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
import transsoft.GenericUtility.BaseClass;
import transsoft.GenericUtility.Endpoint;
import transsoft.GenericUtility.IConstantUtilities;
import transsoft.ObjectRepository.CreateProjectPage;
import transsoft.ObjectRepository.HomePage;

public class AddProjectTest extends BaseClass{
	
	
	
	@Test
	public void createProject() throws EncryptedDocumentException, IOException, SQLException
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
       
       
      //check whether project is created through rmgYanyta API
       
             Response resp = given()
    		 .get(Endpoint.getAllProject);
             List<String> pId=resp.jsonPath().get("ProjectName");
             
             for(String actid:pId)
             {
            	 if(expextRes.equals(actid))
            	 {
            		 break;
            	 }
            	 
            	 
             }
             
             
             
             Reporter.log("projected created successfully",true);
             
             
    		
     //   Database verifications 
             
//             Driver ref=new com.mysql.jdbc.Driver();
//     		DriverManager.registerDriver(ref);
//     		 String URL=IConstantUtilities.url;
//     		 String USERNAME=IConstantUtilities.username;
//     		String PASWORD=IConstantUtilities.password;
//             
//     		Connection con = DriverManager.getConnection(URL, USERNAME, PASWORD);
             
             dutil.dBconnection();
            Statement sta = con.createStatement();
             String query="select * from project where project_name='"+projectname+"'";
             ResultSet result = sta.executeQuery(query);
             
             String actualId=null;
             while(result.next())
            {
            	 actualId=result.getString(4);
            	 
             }
             
             Assert.assertEquals(expextRes, actualId,"project not crrated");
             Reporter.log("project crated suceesfully",true);  
             
       
       
       
	}

}
