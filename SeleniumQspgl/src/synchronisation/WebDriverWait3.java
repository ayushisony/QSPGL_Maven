package synchronisation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWait3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		boolean status = wait.until(ExpectedConditions.titleContains("Instagram"));
		if(status)
			System.out.println("Navigation to instagram successful");
		else
			System.out.println("page not found");
		driver.quit();

	}

}
