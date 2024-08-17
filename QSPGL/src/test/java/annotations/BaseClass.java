package annotations;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	@BeforeSuite
	public void suiteSetup() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void testSetup() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void classSetup() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void methodSetup() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void methodUnset() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void classUnset() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void testUnset() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void suiteUnset() {
		System.out.println("AfterSuite");
	}

}
