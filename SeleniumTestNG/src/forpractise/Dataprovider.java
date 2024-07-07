package forpractise;

import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dataprovider {
@DataProvider(name="AmazonRegistration")
public Object [][] dt() {
	    Object ob[][]  =new Object[3][4];
	    ob[0][0]="jyo";
	    ob[0][1]="jyokarri@gmail.com";
	    ob[0][2]="jyo1234";
	    ob[0][3]="jyo1234";
	    //2nd credentials
	    ob[1][0]="sam";
	    ob[1][1]="sam@gmail.com";
	    ob[1][2]="s1234";
	    ob[1][3]="s1234";
	    //3rd credentials
	    ob[2][0]="ram";
	    ob[2][1]="Ram@gmail.com";
	    ob[2][2]="r1234";
	    ob[2][3]="r1234";
	    
	 return ob;
}
@Test(dataProvider="AmazonRegistration")
public void tc(String name, String email, String password, String rePassword) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&webAuthnChallengeIdForAutofill=K3byLKqhAm458f0_SBJMRohRhMSMTuXh%3ANA&webAuthnGetParametersForAutofill=eyJycElkIjoiYW1hem9uLmNvbSIsImNoYWxsZW5nZSI6IkszYnlMS3FoQW00NThmMF9TQkpNUm9oUmhNU01UdVhoIiwidGltZW91dCI6OTAwMDAwLCJhbGxvd0NyZWRlbnRpYWxzIjpudWxsLCJtZWRpYXRpb24iOiJjb25kaXRpb25hbCIsInVzZXJWZXJpZmljYXRpb24iOiJwcmVmZXJyZWQifQ%3D%3D&pageId=usflex&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%3Fk%3Damaz%25C3%25B2n%26gad_source%3D1%26hvadid%3D688972251336%26hvdev%3Dc%26hvlocphy%3D1018578%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D402977921355966247%26hvtargid%3Dkwd-295032477826%26hydadcr%3D26854_11665510%26tag%3Dgooghydr-20%26ref%3Dnav_ya_signin&prevRID=87YCMBRN1YRZ478M5GNZ&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window();
	WebElement firstnamelastname =d.findElement(By.cssSelector("#ap_customer_name"));
	firstnamelastname.sendKeys(name);
	WebElement id =d.findElement(By.cssSelector("#ap_email"));
	id.sendKeys(email);
	WebElement pass=d.findElement(By.cssSelector("#ap_password"));
	pass.sendKeys(password);
	
	WebElement repas =d.findElement(By.cssSelector("#ap_password_check"));
	repas.sendKeys(rePassword);
	
	
}

	
	
	
	
}
