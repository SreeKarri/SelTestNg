package iRetry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class TestCase1 {
@Test(retryAnalyzer =iRetry.HowtoRerunTCforMultipleTimes.class)//=packagename.classname.class
public void Tc() {
	WebDriver d= new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().window();
	WebElement searchtfield =d.findElement(By.name("a"));
	searchtfield.sendKeys("maryland");
	searchtfield.sendKeys(Keys.ENTER);
}

}
