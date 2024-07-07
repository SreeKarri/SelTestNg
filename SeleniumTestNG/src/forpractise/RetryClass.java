package forpractise;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {
int initialcount =0;
int retrytimes=3;

	
public boolean retry(ITestResult result) {
	
	for(int i=0;i<3;i++) {
	     if(i<retrytimes) {
	    	 initialcount++	;
	    	
	     }
	     return true;
	}
	
		
		return false;
}


	

}
