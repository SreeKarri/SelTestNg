package forpractise;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SkipTc {
@Test
public static void login() {
	Assert.assertEquals(true, false);
	Assert.assertTrue(false);
	
}

@Test(dependsOnMethods="login")
public static void logout() {
	
}
}
