package transsoft.GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class will provide generic method related to web driver
 * @author mishr
 *
 */
public class WebDriverUtilities {
	
	/**
	 * This method will maximize the browser
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will perform implicitly wait
	 * @param driver
	 * @param longsec
	 */
	public void waitImp(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * this method will switch to alert
	 * @param driver
	 */
	public void alertPop(WebDriver driver)
	{
		driver.switchTo().alert();
	}
	
	
	/**
	 * Thos method will select the option from the dropdown based on indexnumber
	 * @param element
	 * @param index
	 */
	public void dropDown(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
		
	}
	
	
	/**
	 * This method will perform dragandDrop to corresponding x and y coordinates
	 * @param driver
	 * @param src
	 * @param x
	 * @param y
	 */
	public void dragAndDropBy(WebDriver driver,WebElement src,int x,int y)
	{
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}
	
	
	/**
	 * This method will take the screenshot
	 * @param driver
	 * @param screenshotname
	 * @return
	 * @throws IOException
	 */
	public String screenshot(WebDriver driver,String screenshotname) throws IOException
	{
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dst=new File(".\\Screenshot\\"+screenshotname+".png");
		FileUtils.copyFile(src, dst);
		
		return dst.getAbsolutePath();
		
	}
	
	/**
	 * This method wait till the element to be visible
	 * @param driver
	 * @param element
	 */
	public void visibilityOfEle(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * This method will wait till the element to be clickable
	 * @param driver
	 * @param element
	 */
	
	public void elementToBeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	/**
	 * This method will scroll to 500 towards y downwards
	 * @param driver
	 */
	
	public void scrollWindow(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(500,0);");
		
	}
	
	/**
	 * This method will perform scroll action to particular element
	 * @param driver
	 * @param element
	 */
	public void scrollToElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",element);
		
	}
	
	/**
	 * This method will switch one window to another window
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchWindow(WebDriver driver,String partialWindowTitle)
	{
		
		Set<String> allid = driver.getWindowHandles();
		for(String id:allid)
		{
			String wintitle=driver.switchTo().window(id).getTitle();
			if(wintitle.contains(partialWindowTitle))
				break;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
