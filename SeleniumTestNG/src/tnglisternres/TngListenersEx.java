package tnglisternres;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TngListenersEx implements ITestListener {
	static WebDriver d;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		 TakesScreenshot a1 =(TakesScreenshot) d;
	        File source =a1.getScreenshotAs(OutputType.FILE);
	        File destination =new File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Passed Tc\\"+Math.random()+".jpg");
	        try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        Reporter.log("Tc passed sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot a2=(TakesScreenshot) d;
		File source1=a2.getScreenshotAs(OutputType.FILE);
		File destination1 =new File("C:\\Users\\kash9\\OneDrive\\Desktop\\Git\\Selenium-programs\\SeleniumProject\\photos\\Failed TC\\" + Math.random()+".jpg");
		
		try {
			FileHandler.copy(source1, destination1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
