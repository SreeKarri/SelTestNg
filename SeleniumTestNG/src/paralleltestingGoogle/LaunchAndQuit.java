package paralleltestingGoogle;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchAndQuit {
	 static WebDriver d;
@BeforeMethod
@Parameters("browser")
public static void launch(String nameofbrowser) {
	if(nameofbrowser.equals("Chrome")) {
		d=new ChromeDriver();
	}
	if(nameofbrowser.equals("Edge")) {
		d=new EdgeDriver();
	}
	d.get("https://www.google.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
}
@AfterMethod
public static void quit() throws IOException, InterruptedException {
	TakesScreenshot ts=(TakesScreenshot) d;
	File source =ts.getScreenshotAs(OutputType.FILE);
	File destination =new File("C:\\Users\\kash9\\OneDrive\\Desktop\\MKT links\\Screenshots\\"+Math.random()+".jpg");
	FileHandler.copy(source, destination);
	
	Thread.sleep(3000);
   d.quit();
}

}
