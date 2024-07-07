import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class JavaScriptExecutorScrolldown {
@Test
public void Tc() throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.costco.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement aboutus =d.findElement(By.linkText("About Us"));
	 Point p =aboutus.getLocation();
	     int x  = p.getX(); 
	     int y=p.getY();
	     System.out.println(x);
	     System.out.println(y);
	     JavascriptExecutor e1   =(JavascriptExecutor) d;
	     e1.executeScript("window.scrollBy()");
	 e1.executeScript("window.scrollBy(0,120802)"); //scroll down
	 
	  Thread.sleep(2000);
	 e1.executeScript("window.scrollBy(0,-120802)"); //scroll up
	 
	 
	}
}
