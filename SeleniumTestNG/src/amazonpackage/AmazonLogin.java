package amazonpackage;

import java.time.Duration;
import java.util.Iterator;




import java.util.Set;

//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin {
   @Test
   public static void login() throws InterruptedException {
	   WebDriver d= new EdgeDriver();
	   d.get("https://www.amazon.com/");
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
	WebElement AccountandList =d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a1 =new Actions(d);
		a1.moveToElement(AccountandList).perform()	;
		WebElement sigin=d.findElement(By.xpath("//span[.='Sign in']"));
		sigin.click();
		WebElement email=d.findElement(By.cssSelector("#ap_email"));
		email.sendKeys("jyokarri@gmail.com");
		email.sendKeys(Keys.ENTER);
		//WebElement conti=d.findElement(By.cssSelector("#continue"));
		//conti.click()	;
		WebElement pass =d.findElement(By.name("password"));
		pass.sendKeys("Sree98765");
		pass.sendKeys(Keys.ENTER);
		WebElement search =d.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		  Thread.sleep(5000);
	 WebElement AccountandList1 =d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		 a1.moveToElement(AccountandList1).perform();
	WebElement signout =d.findElement(By.xpath("//a[@id='nav-item-signout']"));
	signout.click();
	          
	/*WebElement addtolist =d.findElement(By.id("add-to-wishlist-button-submit"));
	addtolist.click();
	WebElement listname=d.findElement(By.id("list-name"));
	listname.sendKeys("Mkt");
	WebElement createlist =d.findElement(By.className("a-button-input a-declarative"));
	createlist.click()	;
	d.switchTo().alert();
    WebElement adtocart =d.findElement(By.name("submit.addToCart"));
    adtocart.click();
	/*Set<String> st    = d.getWindowHandles()	;
    System.out.println(st);
	     Iterator <String> twowindowids   = st.iterator();
	              String parid   = twowindowids.next();
	                String chilid=twowindowids.next();
	                System.out.println("parid");
	                System.out.println("chilid");
	
	
	
	
	////WebElement viewlist=d.findElement(By.xpath("//a[.='View List']"));
	//viewlist.click();
	//WebElement addtocart=d.findElement(By.xpath("//a[.='Add to Cart']"));
	//addtocart.click();	*/
	
	
	
	
	
	
		
		
		
		
		
		
   }
   
}
