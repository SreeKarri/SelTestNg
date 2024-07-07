package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
@Test
public void tc() throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	
	d.get("https://www.amazon.com/");
d.manage().window();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchitem.sendKeys("shoe");
	searchitem.sendKeys(Keys.ENTER);
	
	  WebElement shoe7=d.findElement(By.xpath("(//span[@class='rush-component'])[7]"));
	  Actions a=new Actions(d); a.moveToElement(shoe7).perform();
	  Thread.sleep(2000);
	 shoe7.click();
	 	WebElement sizelabel=d.findElement(By.className("a-form-label"));
	Assert.assertEquals(sizelabel.isDisplayed(),true,"Shoe size not found");
	
}
}
