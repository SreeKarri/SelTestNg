package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Equals_Assert {
@Test
public void Tc1() throws InterruptedException {
	
	ChromeDriver d=new ChromeDriver();
	//d.get("https://www.google.com/");
	d.get("https://www.amazon.com/");
d.manage().window();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement search=d.findElement(By.name("q"));
	//WebElement searchitem =d.findElement(By.cssSelector("#twotabsearchtextbox"));
	Assert.assertEquals(d.getTitle(), "Amazon.com. Spend less. Smile more.","Tc failed");
	
	//Assert.assertEquals(searchitem.isDisplayed(),true,"Test case failed" );
	
	//search.sendKeys("india");
	//search.sendKeys(Keys.ENTER);

	Thread.sleep(500);
	
	
	//Assert.assertEquals(d.getTitle(), "Google","sorry");
	//Assert.assertEquals(d.getTitle(), "india - Google Search","sorry");
}
}
