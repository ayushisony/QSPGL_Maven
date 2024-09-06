package popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows 
{

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		switchtoWindow("google");
		driver.findElement(By.name("q")).sendKeys("JIRA");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.close();
		switchtoWindow("flipkart");
		driver.findElement(By.name("q")).sendKeys("ipad");
		driver.findElement(By.className("_2iLD__")).submit();
		Thread.sleep(2000);
		driver.close();
		switchtoWindow("swiggy");
		WebElement logo = driver.findElement(By.cssSelector("svg._8pSp-"));
		if(logo.isDisplayed())
			System.out.println("logo is displayed");
		else
			System.out.println("logo not found");
		driver.close();
		switchtoWindow("facebook");
		String headertext = driver.findElement(By.className("_8eso")).getText();
		System.out.println(headertext);
		driver.quit();

	}
	private static void switchtoWindow(String url) 
	{
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		while(it.hasNext())
				{
			driver.switchTo().window(it.next());
			if(driver.getCurrentUrl().contains(url))
				break;
					
				}

	}

}
