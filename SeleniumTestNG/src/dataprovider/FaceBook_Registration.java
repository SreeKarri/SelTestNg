package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBook_Registration {

	@DataProvider(name="Registration_details")
	public Object [][] method(){
		Object ob [][]=new Object [3][5];
		ob [0][0]="jyo";
		ob [0][1]="k";
		ob [0][2] ="jyokarri@gmail.com";
		ob [0][3]="jyokarri@gmail.com";
		ob [0][4]="sno12345";
		//ram credentials
		ob [1][0]="kiran";
		ob [1][1]="k";
		ob [1][2]="Ram@gmail.com";
		ob [1][3]="Ram@gmail.com";
		ob [1][4]="ram1234";
		//sam credentials
		ob [2][0]="Sam";
		ob [2][1]="k";
		ob [2][2]="sam@gmail.com";
		ob [2][3]="sam@gmail.com";
		ob [2][4]="ram1234";
		return ob;
	}	
	
	
	@Test(dataProvider="Registration_details")
	public void reg(String firstname, String lastname, String email,String email2,String passwored ) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement un =driver.findElement(By.name("firstname"));
		un.sendKeys(firstname);
		WebElement un_las= driver.findElement(By.name("lastname"));
		un_las.sendKeys(lastname);
		WebElement un_em =driver.findElement(By.name("reg_email__"));
		un_em.sendKeys(email);
		WebElement un_re_em =driver.findElement(By.name("reg_email_confirmation__"));
		un_re_em.sendKeys(email2);
		
	    WebElement un_pas=driver.findElement(By.name("reg_passwd__"));
	    un_pas.sendKeys(passwored);

		}
		
	}
	
	

