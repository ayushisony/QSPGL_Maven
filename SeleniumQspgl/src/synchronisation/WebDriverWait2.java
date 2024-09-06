package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWait2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("112233");
		driver.findElement(By.name("password")).sendKeys("112233");
		WebElement login = driver.findElement(By.xpath("//button[.='Log in']"));
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		Thread.sleep(3000);
		

		
	}

}
