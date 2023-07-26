package transsoft.GenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * This class will take the screenshot of the failed script and generate report
 * @author mishr
 *
 */
public class ListenerImplementation implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("execution started");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+" "+" Test script passed");
		
	}

	public void onTestFailure(ITestResult result) {
		
		JavaUtility jutil=new JavaUtility();
		String methodname=result.getMethod().getMethodName()+jutil.getSystemFormat();
		WebDriverUtilities wutil=new WebDriverUtilities();
//		try {
//			//wutil.screenshot(BaseClass.ListenerDriver, methodname);
//		//} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
