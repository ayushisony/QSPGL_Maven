package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTest 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0] = "India";
		obj[0][1] = "Scotland";
		
		obj[1][0] = "India";
		obj[1][1] = "Canada";
		
		obj[2][0] = "India";
		obj[2][1] = "New Jersey";
		
		return obj;
		
	}
	
	@Test(dataProvider = "data")
	public void bookticketTest(String from, String to)
	{
		System.out.println("From: "+ from + "\nTo: "+ to);
	}

}
