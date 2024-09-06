package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		driver.quit();

	}

}
