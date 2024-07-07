package assertion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Naukiri {
@Test
public void Tc3() throws InterruptedException {
	WebDriver d = new EdgeDriver();
	d.get("https://www.naukri.com/registration/createAccount");
	d.manage().window().maximize();
	WebElement google = d.findElement(By.className("google-text"));
	google.click();

	Set<String> s = d.getWindowHandles();
	Iterator<String> parentchild = s.iterator();
	System.out.println(s.size());

	String parentid = parentchild.next();
	String childid = parentchild.next();
	d.close();

	

	System.out.println(childid);
	Set <String> s1=d.getWindowHandles();
	Thread.sleep(2000);
	Assert.assertEquals(s1.size(), 3, childid);
	
	//Assert.assertEquals(s1.size(), 1, "Sorry,got more than 1tab");

	// System.out.println("total no of windows is "+s.size());
	// Assert.assertEquals(s.size(), 2,"not found");

}
}
