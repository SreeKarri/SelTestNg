package googleCrossAndpar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class GoogleTestinfg {
	WebDriver d;
@BeforeMethod
@Parameters("browsers")
public void rightclick(String nameofbrowsers) {
	if(nameofbrowsers.equals("chrome")) {
		d=new ChromeDriver();}
	if(nameofbrowsers.equals("edge")) {
		d=new EdgeDriver();
	}
	if(nameofbrowsers.equals("firefox")) {
		d=new FirefoxDriver();
	}
	d.get("https://www.google.com/");
	d.manage().window();
	/*WebElement gmail =d.findElement(By.linkText("Gmail"));
	Actions a1 =new Actions(d);
	
	    a1.doubleClick(gmail).perform();
	    gmail.click();*/
	
	    
	   
	
	
	
	
}
}
