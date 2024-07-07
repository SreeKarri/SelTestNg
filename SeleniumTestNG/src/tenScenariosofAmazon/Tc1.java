package tenScenariosofAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc1 extends LoginAndLogout{
@Test
public void Tc() throws InterruptedException {

	WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchitem.sendKeys("shoe");
	searchitem.sendKeys(Keys.ENTER);
	WebElement shoe1 =d.findElement(By.xpath("(//span[@class='rush-component'])[4]"));
	Actions a=new Actions(d);
	a.moveToElement(shoe1).perform();
	Thread.sleep(2000);
	shoe1.click();
	
	WebElement sizelabel=d.findElement(By.className("a-form-label"));
	Assert.assertEquals(sizelabel.isDisplayed(),true,"Shoe size not found");
}
}
