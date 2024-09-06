package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDoubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement coursetab=  driver.findElement(By.id("course"));
		Actions actions = new Actions(driver);
		actions.moveToElement(coursetab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='selenium']")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity"));
		//converting to integer
		int initialquantity = Integer.parseInt(quantity.getAttribute("value"));
		WebElement plusbutton = driver.findElement(By.id("add"));
		actions.doubleClick(plusbutton).perform();
		int finalquantity = Integer.parseInt(quantity.getAttribute("value"));
		if (finalquantity==(initialquantity+1))
			System.out.println("test passed");
		else
			System.out.println("test failed");
		driver.quit();
	}

}
