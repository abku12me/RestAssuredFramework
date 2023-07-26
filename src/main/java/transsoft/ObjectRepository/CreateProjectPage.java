package transsoft.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transsoft.GenericUtility.WebDriverUtilities;

public class CreateProjectPage{
	
	WebDriverUtilities wutil=new WebDriverUtilities();
	@FindBy(name="projectName")
	private WebElement projectNameEdTx;
	
	@FindBy(name="teamSize")
	private WebElement teamSizeEdTx;
	
	@FindBy(name="createdBy")
	private WebElement createdByEdTx;
	
	@FindBy(xpath="//label[text()='Project Status ']/../descendant::select[@name='status']")
	private WebElement  ProjectStatusdrop;
	
	@FindBy(xpath="//input[@value='Add Project']")
	private WebElement AddProjectlink;
	
	
	public CreateProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProjectNameEdTx() {
		return projectNameEdTx;
	}

	public WebElement getTeamSizeEdTx() {
		return teamSizeEdTx;
	}

	public WebElement getCreatedByEdTx() {
		return createdByEdTx;
	}

	public WebElement getProjectStatusdrop() {
		return ProjectStatusdrop;
	}

	public WebElement getAddProjectlink() {
		return AddProjectlink;
	}
	
	//Business libaraies
	
	
	public void createProject(WebDriver driver,String projectname,String createdBy)
	{
//	     wutil.alertPop(driver);
		projectNameEdTx.sendKeys(projectname);
		createdByEdTx.sendKeys(createdBy);
		wutil.dropDown(ProjectStatusdrop,0);
		AddProjectlink.click();
		
	}
	
	
	
	
	
	
	
	
	
	

}
