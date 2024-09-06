package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
		driver.findElement(By.cssSelector("button.selected")).click();		

	}

}
