package tenScenariosofAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc7 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
	
		WebElement e2 = d.findElement(By.id("searchDropdownBox"));

		Select s = new Select(e2);

		s.selectByVisibleText("Amazon Fresh");

		WebElement searchitem = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchitem.sendKeys("mangoes");
		searchitem.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement checkcalories =d.findElement(By.xpath("//span[.='Up to 40 Calories']"));
		//checkcalories.click();
		
		Assert.assertEquals(checkcalories.isSelected(),false);
	}
}
