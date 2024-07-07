package tenScenariosofAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc5 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {

	WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchitem.sendKeys("camera");
	searchitem.sendKeys(Keys.ENTER);
	WebElement cam15 =d.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[15]"));
	Actions a=new Actions(d);
	a.moveToElement(cam15).perform();
	Thread.sleep(2000);
	cam15.click();
	
	Thread.sleep(5000);
	
	WebElement pickup =d.findElement(By.xpath("//span[.='Pickup']"));
	pickup.click();
	Assert.assertEquals(pickup.isEnabled(),true,"sorry,not found");
}
}
