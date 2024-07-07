package forpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut=3000)
	public void Tc() {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window();
		WebElement searchtfield =d.findElement(By.name("q"));
		searchtfield.sendKeys("maryland");
		searchtfield.sendKeys(Keys.ENTER);
	}
}
