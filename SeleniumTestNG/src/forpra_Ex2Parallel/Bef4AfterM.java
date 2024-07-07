package forpra_Ex2Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Bef4AfterM {
	WebDriver d;
@BeforeMethod
@Parameters("browser")
public void bf(String nameofbrowser) {
	if(nameofbrowser.equals("Chrome")){
		d=new ChromeDriver();
	}
	if(nameofbrowser.equals("Edge")) {
		d=new EdgeDriver();
	}
	
}
}
