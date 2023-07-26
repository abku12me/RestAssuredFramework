package transsoft.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText="Projects")
	private WebElement projectsLink;
	
	@FindBy(xpath="//span[.='Create Project']")
	private WebElement createProjectlink;
	
	@FindBy(linkText="Logout")
	private WebElement LogoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getProjectsClick() {
		return projectsLink;
	}
	
	public WebElement getCreateProject() {
		return createProjectlink;
	}
	
	
	public void clickOncfeateProject()
	{
		createProjectlink.click();
		
	}
	
	
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	
	
	//Business libararies
	
	


	/**
	 * This method will perform click action on projects
	 */
	public void clickOnProject()
	{
		projectsLink.click();
		
	}
	
	/**
	 * click on logout buuton
	 */
	public void logout()
	{
		LogoutLink.click();
		
	}
	
	
	public String validateProject(WebDriver driver,String projectname)
	{
		
		String project=driver.findElement(By.xpath("//td[text()='"+projectname+"']")).getText();
		return project;
	}
	
	
	
	
	
	
	

}
