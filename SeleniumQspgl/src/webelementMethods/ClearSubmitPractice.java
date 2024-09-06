package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSubmitPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchTF= driver.findElement(By.id("twotabsearchtextbox"));
		searchTF.sendKeys("shoes");
		Thread.sleep(4000);
		searchTF.clear();
		searchTF.sendKeys("softtoys");
		driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(4000);
		driver.quit();

	}

}
