package hirerchyGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase3 extends Google {
@Test
public void Tc3	() {
	WebElement searchtfield =d.findElement(By.name("q"));
	searchtfield.sendKeys("shoe");
	searchtfield.sendKeys(Keys.ENTER);
	
	WebElement shopping =d.findElement(By.xpath("//div[.='Shopping']"));
	
	shopping.click();
	
	
	
}
}
