package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsEnabledMethod {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Loginbtn= driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println("Before entering credentials:");
		if(Loginbtn.isEnabled())
		{
			System.out.println("Enabled");
			Loginbtn.click();
		}
		else
		{
			System.out.println("Disabled");
		}
		
		driver.findElement(By.name("username")).sendKeys("112233");
		driver.findElement(By.name("password")).sendKeys("112233");
		System.out.println("After entering credentials:");
		if(Loginbtn.isEnabled())
		{
			System.out.println("Enabled");
			Loginbtn.click();
		}
		else
		{
			System.out.println("Disabled");
		}
	
		driver.quit();
		


	}

}
