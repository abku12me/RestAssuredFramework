package transsoft.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	
	@FindBy(id="usernmae")
	private WebElement usernameEdbx;
	
	@FindBy(id="inputPassword")
	private WebElement passwordEdbx;
	
	@FindBy(xpath="//button[.='Sign in']")
	private WebElement signBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	public WebElement getUsernameEdbx() {
		return usernameEdbx;
	}

	public WebElement getPasswordEdbx() {
		return passwordEdbx;
	}

	public WebElement getSignBtn() {
		return signBtn;
	}
	
	
	//Business Libaraies
	
	
	/**
	 * This method will login to application
	 * @param driver
	 * @param url
	 * @param username
	 * @param password
	 * @throws InterruptedException 
	 */
	public void LoginToApp(WebDriver driver,String url,String username,String password) throws InterruptedException
	{
		driver.get(url);
		usernameEdbx.sendKeys(username);
		passwordEdbx.sendKeys(password);
		signBtn.click();	
	}
	
	
	
	
	
	
	
	
	
	
}
