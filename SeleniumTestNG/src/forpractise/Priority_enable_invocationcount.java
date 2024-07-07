package forpractise;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Priority_enable_invocationcount {


@Test(priority=2)
public static void Tc1() {
System.out.println("Tc1");	
}

@Test(enabled=false)
public static void Tc2() {
	System.out.println("Tc2");
}
@Test(invocationCount=5)
public static void Tc3() {
System.out.println("Tc3");	
}

}
