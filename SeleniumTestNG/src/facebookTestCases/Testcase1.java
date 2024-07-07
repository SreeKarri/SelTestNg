package facebookTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase1 {
@Test
public static  void login() {
	FirefoxDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	WebElement email=d.findElement(By.cssSelector("#email"));
	email.sendKeys("sreenyakarri@gmail.com");
	WebElement passkey =d.findElement(By.cssSelector("#pass"));
	passkey.sendKeys("Venya1234");
	WebElement login =d.findElement(By.name("login"));
	login.click();
	WebElement marketplace=d.findElement(By.xpath("//span[.='Marketplace']"));
	Actions a=new Actions(d);
	a.moveToElement(marketplace).perform();
	marketplace.click();
	WebElement ite =d.findElement(By.xpath("(//div[@class='x78zum5 x1a02dak x1c0ccdx x10l6tqk xzadtn0 x1pdr0v7 x9s46ru'])[1]"));
	ite.click();
}
}
