package tnglisternres;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TngListenersEx.class)
public class TestCase1 extends TngListenersEx{
@Test
public static void Tc() throws InterruptedException {
	 d=new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window();
	
	WebElement searchtfield =d.findElement(By.name("q"));
	searchtfield.sendKeys("maryland");
	searchtfield.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Reporter.log("searching is successfull");
}
}
