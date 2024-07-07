package tenScenariosofAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tc10 extends LoginAndLogout{
	@Test
	public void Tc(){

		WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchitem.sendKeys("shoe");
		searchitem.sendKeys(Keys.ENTER);
		d.navigate().back();
}
}
