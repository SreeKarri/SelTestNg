package tenScenariosofAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc8 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
	
		WebElement e2 = d.findElement(By.id("searchDropdownBox"));

		Select s = new Select(e2);

		s.selectByVisibleText("Books");

		WebElement powofmind = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		powofmind.sendKeys("power of mind");
		powofmind.sendKeys(Keys.ENTER);
		WebElement sel1 =d.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		Actions a=new Actions(d);
		a.moveToElement(sel1).perform();
		Thread.sleep(2000);
		sel1.click();
		
		WebElement addtocart =d.findElement(By.id("add-to-cart-button"));
		//addtocart.click();
		Assert.assertEquals(addtocart.isEnabled(),true,"sorry,not found");
	}
}
