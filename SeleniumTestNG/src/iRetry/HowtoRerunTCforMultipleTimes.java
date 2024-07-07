package iRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class HowtoRerunTCforMultipleTimes implements IRetryAnalyzer{
     int initial_count=0;
     int retry_times=3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(initial_count<retry_times) {  //0<3,1<3
			initial_count++;
			return true;
		}
		
		
		
		return false;  ///if we change this to true,the tc's will run infinite times
	}

	

}
