package tenScenariosofAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc2 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
	
	WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchitem.sendKeys("mobile phones");
	searchitem.sendKeys(Keys.ENTER);
	WebElement mobile =d.findElement(By.xpath("(//div [@class='aok-relative'])[3]"));
	Actions a=new Actions(d);
	a.moveToElement(mobile).perform();
	Thread.sleep(2000);
	mobile.click();
	
	
 	WebElement  colselection =d.findElement(By.xpath("(//div[@class='twisterImageDiv twisterImageDivWrapper'])[1]"));
Assert.assertEquals(colselection.isDisplayed(),false,"color options not displaying");
}
}