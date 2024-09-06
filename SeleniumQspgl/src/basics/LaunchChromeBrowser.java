package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser 
{

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", "/Users/nitishbhatia/eclipse-workspace/SeleniumQspgl/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
	}

}
