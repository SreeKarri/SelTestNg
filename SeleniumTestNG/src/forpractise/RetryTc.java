package forpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryTc {
	static WebDriver d;
@Test(retryAnalyzer=forpractise.RetryClass.class)
public static void tc() {
	d= new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window();
	WebElement searchtfield =d.findElement(By.name("a"));
	searchtfield.sendKeys("maryland");
	searchtfield.sendKeys(Keys.ENTER);
}

}
