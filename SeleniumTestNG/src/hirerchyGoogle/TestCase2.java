package hirerchyGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class TestCase2 extends  Google{
@Test
public void Tc2() {
	WebElement searchtfield =d.findElement(By.name("q"));
	searchtfield.sendKeys("india");
	searchtfield.sendKeys(Keys.ENTER);
	
	WebElement image =d.findElement(By.xpath("//div[.='Images']"));
	
	image.click();
	WebElement imgno=d.findElement(By.xpath("(//div[@class='H8Rx8c'])[4]"));
	imgno.click();
}
}
