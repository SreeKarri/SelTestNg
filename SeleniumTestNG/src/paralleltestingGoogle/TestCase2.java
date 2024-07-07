package paralleltestingGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchAndQuit{
@Test 
public static void Tc2() throws InterruptedException {
	WebElement search =d.findElement(By.name("q"));
	
	search.sendKeys("lord Rama image");
	
	search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	
}
}
