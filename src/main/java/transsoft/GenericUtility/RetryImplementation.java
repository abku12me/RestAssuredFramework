package transsoft.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This class will execute only if the test script got failed
 * @author mishr
 *
 */

public class RetryImplementation implements IRetryAnalyzer{

	int  count=0;
	int incount=4;

	
	public boolean retry(ITestResult result) {
		
		while(count<incount)
		{
			count++;
			return true;
		}

		return false;
	}
	
	
	
	

}
