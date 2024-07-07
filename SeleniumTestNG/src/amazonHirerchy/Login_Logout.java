package amazonHirerchy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Login_Logout {
	WebDriver d;

	@BeforeMethod
	@Parameters("browser")
	public void LL(String nameofbrowser) {
		if (nameofbrowser.equals("Chrome")) {
			d = new ChromeDriver();
		}

		if (nameofbrowser.equals("edge")) {
			d = new EdgeDriver();
		}
		/*
		 * if (nameofbrowser.equals("Firefox")) { d = new FirefoxDriver(); }
		 */
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();

		/*
		 * WebElement AccountandList
		 * =d.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")); Actions
		 * a1 =new Actions(d); a1.moveToElement(AccountandList).perform() ; WebElement
		 * sigin=d.findElement(By.cssSelector(".nav-action-inner")); sigin.click();
		 * WebElement email=d.findElement(By.cssSelector("#ap_email"));
		 * email.sendKeys("jyokarri@gmail.com"); email.sendKeys(Keys.ENTER);
		 * //WebElement conti=d.findElement(By.cssSelector("#continue"));
		 * //conti.click() ; WebElement pass =d.findElement(By.name("password"));
		 * pass.sendKeys("Venya@1234"); pass.sendKeys(Keys.ENTER);
		 */

	}
	/*
	 * @AfterMethod public void logout() throws InterruptedException { WebElement
	 * AccountandList
	 * =d.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")); Actions
	 * a=new Actions(d); a.moveToElement(AccountandList).perform() ; WebElement
	 * signout =d.findElement(By.xpath("//span[.='Sign Out']")); signout.click(); }
	 * Thread.sleep(9000); d.close(); }
	 */
}
