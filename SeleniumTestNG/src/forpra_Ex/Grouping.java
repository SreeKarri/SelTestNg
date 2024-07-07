package forpra_Ex;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping {
	static WebDriver d ;
@Test (groups = {"smoke","system"})
public static void Tc() {
	/*
	 * d =new ChromeDriver(); d.get("https://www.google.com/");
	 * d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * d.manage().window(); WebElement search=d.findElement(By.name("q"));
	 * search.sendKeys("Ellicott city"); search.click();
	 */
}
@Test(groups= {"smoke"})

public static void tc2() {
	
}
@Test(groups= {"system"})
public static void tc3() {
	System.out.println("message");
}

}
	