package autosuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> element = driver.findElements(By.xpath("//li[contains(.,'selenium')]"));
		for(WebElement e : element)
			
		{
			System.out.println(e.getText());
		}
	}

}
