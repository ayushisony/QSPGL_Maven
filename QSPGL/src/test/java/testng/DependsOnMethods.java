package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test(dependsOnMethods = "test2")
	public void test1()
	{
		Reporter.log("test1", true);

	}
	@Test(priority = -1)
	public void test2()
	{
		Reporter.log("test2", true);

	}
	

}
