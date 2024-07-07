package parallel;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver d;

	@BeforeMethod
	@Parameters("browser")
	public void testcase1(String nameofbrowser) {
		if (nameofbrowser.equals("Chrome")) {
			d = new ChromeDriver();
		}

		if (nameofbrowser.equals("edge")) {
			d = new EdgeDriver();
		}
		if (nameofbrowser.equals("Firefox")) {
			d = new FirefoxDriver();
		}

		d.get("https://www.google.com/");
		d.manage().window();
		
	}

	@AfterMethod
	public void AF() {
		d.close();
	}
}
