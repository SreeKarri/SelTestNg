package tenScenariosofAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc4 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
	
	WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchitem.sendKeys("mobile cover");
	searchitem.sendKeys(Keys.ENTER);
	//WebElement brand =d.findElement(By.xpath("//span[.='Brands']"));
	WebElement selbrand =d.findElement(By.xpath("//span[.='OtterBox']"));
	Actions a=new Actions(d);
	a.moveToElement(selbrand).perform();
	Thread.sleep(6000);
	selbrand.click();
	
	
	
	WebElement  mobileimages =d.findElement(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']"));
	Assert.assertEquals(mobileimages.isDisplayed(),true,"color options not displaying");
}
}
