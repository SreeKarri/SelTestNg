package grouping;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@DataProvider(name="data1")
	public Object [][] method1() {
		
		//return new Object[][] {{"Ram "},{"Sam "},{"Tom "},{"sita "}};
		return new Object[][] {{100},{200},{300}};
		}
	
	@Test(dataProvider="data1")
	public void Tc (int number) {
		System.out.println(number+100);
	}
	
	
	
	/*
	 * @Test(dataProvider="data1") public void Tc(String name) {
	 * System.out.println(name.concat("Karri")); }
	 */
	
	
}
