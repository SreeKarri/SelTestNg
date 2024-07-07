package tenScenariosofAmazon;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc9 extends LoginAndLogout{
	@Test
	public void Tc() throws InterruptedException {
		
		WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchitem.sendKeys("Todays deals");
		searchitem.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement todaysdeals = d.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline])[1]"));
		 Actions a=new Actions(d); a.moveToElement(todaysdeals).perform();
		 todaysdeals.click();
          Thread.sleep(3000);
          WebElement item1=d.findElement(By.xpath("(//a[@class='a-link-normal _ZGlzY_link_1FS9h'])[1]"));
          item1.click();
		
	}
}
