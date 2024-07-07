package grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_dataprovider {   ///over testing  

	@DataProvider(name="login_details")
	public Object [][] method(){
		Object ob [][]=new Object [4][2];
		ob [0][0]="jyokarri@gmail.com";
		ob [0][1] ="Venya1234";
		//ram credentials
		ob [1][0]="Ram@gmail.com";
		ob [1][1]="ram1234";
		//sam credentials
		ob [2][0]="Sam@gmail.com";
		ob [2][1]="sam@1234";
		return ob;
		
	}
	@Test(dataProvider="login_details")
	public void loagin(String un,String pwd) {   //need two credentials
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys(un);
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.sendKeys(Keys.ENTER);
		
	}
	
	
	
	
	
	
	
	
}
