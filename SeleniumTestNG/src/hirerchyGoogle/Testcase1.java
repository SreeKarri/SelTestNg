package hirerchyGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 extends Google {
	@Test
	public void Tc() {
		
		WebElement searchtfield =d.findElement(By.name("q"));
		searchtfield.sendKeys("maryland");
		searchtfield.sendKeys(Keys.ENTER);
	}
	}


