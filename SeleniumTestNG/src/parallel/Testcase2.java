package parallel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends ParallelTesting {
@Test
public void tc()  {
	WebElement searchtfield =d.findElement(By.name("q"));
	searchtfield.sendKeys("india");
	searchtfield.sendKeys(Keys.ENTER);
	

	
	
	searchtfield.sendKeys("paris");
	
	searchtfield.sendKeys(Keys.ENTER);
}
}
