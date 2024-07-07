package amazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase_2 extends Launch_quit{
	@Test
	public static void Tc2() throws InterruptedException {
		WebElement searchitem =d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchitem.sendKeys("shoe");
		searchitem.sendKeys(Keys.ENTER);
		WebElement shoe7 =d.findElement(By.xpath("(//span[@class='rush-component'])[7]"));
		Actions a=new Actions(d);
		a.moveToElement(shoe7).perform();
		Thread.sleep(2000);
		shoe7.click();
		WebElement checksize=d.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		a.moveToElement(checksize).perform();
		checksize.click();
		Thread.sleep(2000);
		WebElement selonesize =d.findElement(By.xpath("//a[@id='native_dropdown_selected_size_name_18']"));
		a.moveToElement(selonesize).perform();
		selonesize.click();
		
	}
}
