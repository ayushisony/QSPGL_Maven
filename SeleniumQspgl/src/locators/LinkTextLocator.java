package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("ayushi");
		driver.findElement(By.name("did_submit")).click();
		driver.quit();

	}

}
