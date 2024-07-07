package paralleltestingGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchAndQuit {
@Test 
public static void Tc1() throws InterruptedException {
	WebElement search =d.findElement(By.name("q"));
	Thread.sleep(2000);
	search.sendKeys("tejmahal image");
	
	search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
}
}
