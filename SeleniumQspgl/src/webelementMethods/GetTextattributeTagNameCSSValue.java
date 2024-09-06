package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextattributeTagNameCSSValue 

{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Login = driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(Login.getText());
		System.out.println(Login.getTagName());
		System.out.println(Login.getAttribute("type"));
		System.out.println(Login.getCssValue("background-color"));
		System.out.println(Login.getCssValue("color"));
		System.out.println(Login.getCssValue("font"));
		driver.quit();

	}

}
