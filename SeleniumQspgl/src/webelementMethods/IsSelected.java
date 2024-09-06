package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		if(female.isSelected())
		{
			System.out.println("element selected");
		}
		else
		{
			System.out.println("elemnet not selected");
		}
		driver.quit();
		
		
	
	
	
	}

}
