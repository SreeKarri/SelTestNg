package tenScenariosofAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc3  extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
	
	WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchitem.sendKeys("mouse");
	searchitem.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	WebElement sortby =d.findElement(By.xpath("//span [@class='a-dropdown-prompt']"));
	Actions a=new Actions(d);
	a.moveToElement(sortby).perform();
	Thread.sleep(6000);
	sortby.click();
	WebElement select1 =d.findElement(By.xpath("//a[.='Price: High to Low']"));
	a.moveToElement(select1).perform();
	Thread.sleep(2000);
	select1.click();
	WebElement getitbytomorrow =d.findElement(By.xpath("//span[.='Get It by Tomorrow']"));
	Thread.sleep(2000);
     getitbytomorrow.click();
	WebElement mouse1=d.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	mouse1.click();
	
	
	Thread.sleep(2000);
	
	WebElement addtocart =d.findElement(By.id("add-to-cart-button"));
	addtocart.click();
	Assert.assertEquals(addtocart.isEnabled(),true,"sorry,not found");
}
}
