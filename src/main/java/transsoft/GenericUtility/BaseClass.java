package transsoft.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import transsoft.ObjectRepository.HomePage;
import transsoft.ObjectRepository.LoginPage;

import static io.restassured.RestAssured.*;

import java.io.IOException;
/**
 * This class consists of basic config annotation of testng
 * @author mishr
 *
 */

public class BaseClass {
	
	public PropertyFileUtilities putil=new PropertyFileUtilities();
	public WebDriverUtilities wutil=new WebDriverUtilities();
	public ExcelsheetUtilities eutil=new ExcelsheetUtilities();
	public JavaUtility jutil=new JavaUtility();
	
	public WebDriver driver=null;
	//public static WebDriver ListenerDriver;
	
	@BeforeSuite
	public void DbCongig()
	{
		System.out.println("database connection successfully");
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException, InterruptedException
	{
		String BROWSER=putil.readDataFromPropertyFile(IConstantUtilities.propertpath, "browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			//ListenerDriver=driver;
			
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			//ListenerDriver=driver;
		}
		else
			driver=new ChromeDriver();
		wutil.maximizeBrowser(driver);
		wutil.waitImp(driver);
		//ListenerDriver=driver;
		Thread.sleep(2000);
		
	}
	
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException
	{
		
		String URL=putil.readDataFromPropertyFile(IConstantUtilities.propertpath, "url");
		String USERNAME=putil.readDataFromPropertyFile(IConstantUtilities.propertpath, "username");
		String PASSWORD=putil.readDataFromPropertyFile(IConstantUtilities.propertpath, "password");
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp(driver, URL,USERNAME, PASSWORD);
		
	}
	
	
	@AfterMethod
	public void logoutFromApp()
	{
		HomePage hp=new HomePage(driver);
		hp.logout();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@AfterSuite
	public void dBClose()
	{
		
		System.out.println("database connection successfully closed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
