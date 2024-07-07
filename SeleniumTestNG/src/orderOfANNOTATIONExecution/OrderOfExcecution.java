package orderOfANNOTATIONExecution;

import org.testng.annotations.AfterClass;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExcecution {
	
	@Test          ///  only 1 test case execute
	public static void testcase1() {
		System.out.println("tc1");}
	@Test           ///   2 test case execute
	public static void testcase2() {
		System.out.println("tc2");}
	@BeforeSuite
	public static void bsuite() {
		System.out.println("bsuite");
	}
	@BeforeClass
	public static void befoclass() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public static void bemet() {
		System.out.println("bemethod");
	}
	@BeforeTest
	public static void beftest() {
		System.out.println("bemetest");}
	@AfterMethod
	public static void afmethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public static void Aftertest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public static void Aftrsuit() {
		System.out.println("aftersuite");
	}
	
		
		
		
		
		
		
		
		
		
	}


