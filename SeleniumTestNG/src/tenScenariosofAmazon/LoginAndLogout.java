package tenScenariosofAmazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LoginAndLogout {
	WebDriver d;
@BeforeMethod
@Parameters("browser")
public void Bf(String nameofbrowser) throws InterruptedException {
	if (nameofbrowser.equals("Chrome")) {
		d = new ChromeDriver();
	}

	if (nameofbrowser.equals("edge")) {
		d = new EdgeDriver();
	}
	  d.get("https://www.amazon.com/");
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		WebElement AccountandList =d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a1 =new Actions(d);
		a1.moveToElement(AccountandList).perform()	;
		WebElement sigin=d.findElement(By.xpath("//span[.='Sign in']"));
		sigin.click();
		Thread.sleep(2000);
		WebElement email=d.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("jyokarri@gmail.com");
		email.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement pass =d.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Sree98765");
		pass.sendKeys(Keys.ENTER);
}

@AfterMethod
public void Af() throws InterruptedException {
	  
	 
	WebElement AccountandList1 =d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
			Actions a2 =new Actions(d);
			a2.moveToElement(AccountandList1).perform()	;
			Thread.sleep(4000);
			WebElement signout =d.findElement(By.xpath("//a[@id='nav-item-signout']"));
			a2.moveToElement(signout).perform()	;
			signout.click();         }
	  }
