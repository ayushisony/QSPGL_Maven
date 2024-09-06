package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowDimension 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		Dimension dimension = new Dimension(1300,900);
		driver.manage().window().setSize(dimension);
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		
		
		
		
	}	

}
