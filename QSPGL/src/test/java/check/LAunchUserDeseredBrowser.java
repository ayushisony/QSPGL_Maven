package check;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LAunchUserDeseredBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter browser name:");
		String browser =sc.next();
		WebDriver driver = new ChromeDriver();
			if(browser.equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
			else if(browser.equalsIgnoreCase("firefox"))
				driver = new FirefoxDriver();
			else if(browser.equalsIgnoreCase("edge"))
				driver = new EdgeDriver();
			else
				System.out.println("invalid browser");
			Thread.sleep(2000);
			driver.quit();

	}

}
