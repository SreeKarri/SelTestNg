import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class July4th {
@Test
public void Tc() throws InterruptedException {
WebDriver d=new EdgeDriver();
d.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
d.manage().window().maximize();
WebElement email=d.findElement(By.xpath("//input[@id='ap_email']"));
email.sendKeys("jyokarri@gmail.com");
email.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement pass =d.findElement(By.xpath("//input[@id='ap_password']"));
pass.sendKeys("Sree98765");
pass.sendKeys(Keys.ENTER);
WebElement searchfield =d.findElement(By.id("twotabsearchtextbox"));

searchfield.sendKeys("shoe");
searchfield.sendKeys(Keys.ENTER);
WebElement shoe1=d.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
Thread.sleep(2000);
Actions a=new Actions(d);
a.moveToElement(shoe1).perform();
shoe1.sendKeys(Keys.ENTER);
}
}
