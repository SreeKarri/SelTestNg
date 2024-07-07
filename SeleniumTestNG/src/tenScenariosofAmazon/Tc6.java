package tenScenariosofAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc6 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
		
		WebElement e1 = d.findElement(By.id("searchDropdownBox"));

		Select s = new Select(e1);

		s.selectByVisibleText("Electronics");

		WebElement searchitem = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchitem.sendKeys("Redmi");
		searchitem.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement getitbytomorrow =d.findElement(By.xpath("//span[.='Get It by Tomorrow']"));
				
Thread.sleep(2000);
getitbytomorrow.click();

		Assert.assertEquals(getitbytomorrow.isEnabled(), false,"not checked");
	}

}
