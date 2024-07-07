package hirerchyGoogle;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Google {
	WebDriver d;

	@BeforeMethod
	@Parameters("browser")
	public void Bf(String nameofbrowser) {
		if (nameofbrowser.equals("Chrome")) {
			d = new ChromeDriver();
		}

		if (nameofbrowser.equals("edge")) {
			d = new EdgeDriver();
		}
		if (nameofbrowser.equals("Firefox")) {
			d = new FirefoxDriver();
		}

		d.get("https://www.google.com/");
		//WebDriverWait w1=new WebDriverWait(d,Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("google"));
		//w1.until(ExpectedConditions.titleContains("goo"));
		//w1.until(ExpectedConditions.alertIsPresent());
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window();
		
	}

	@AfterMethod
	public void AF() {
		d.close();
	}
}
	
	
	
	
	
	

