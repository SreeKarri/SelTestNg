package amazonTestCases;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Launch_quit {
static	 WebDriver d;
  @BeforeMethod
  
  public static void login() {
	    d= new EdgeDriver();
	   d.get("https://www.amazon.com/");
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		 WebElement AccountandList=d.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")); Actions
		  a1 =new Actions(d); a1.moveToElement(AccountandList).perform() ;
		  WebElement sigin=d.findElement(By.cssSelector(".nav-action-inner")); 
		  sigin.click();
		  WebElement email=d.findElement(By.cssSelector("#ap_email"));
		 email.sendKeys("jyokarri@gmail.com");
		 email.sendKeys(Keys.ENTER);
		  //WebElement conti=d.findElement(By.cssSelector("#continue"));
		  //conti.click() ; 
		 WebElement pass =d.findElement(By.name("password"));
		  pass.sendKeys("Venya@1234"); pass.sendKeys(Keys.ENTER);
}
  @AfterMethod
  public static void Logout() throws InterruptedException {
	  WebElement AccountandList1 =d.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a2 =new Actions(d);
		a2.moveToElement(AccountandList1).perform()	;
		Thread.sleep(3000);
		WebElement signout =d.findElement(By.xpath("//span[.='Sign Out"));
		a2.moveToElement(signout).perform()	;
		signout.click();
		          
  }
  
  
  
  
  
  
  
  
}
