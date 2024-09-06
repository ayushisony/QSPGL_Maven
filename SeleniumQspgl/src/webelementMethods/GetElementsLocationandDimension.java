package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsLocationandDimension {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement createacc =  driver.findElement(By.xpath("//a[.='Create new account']"));
		
		/*Point location= createacc.getLocation();
		System.out.println("x coordinates: "+location.getX() + "\ty coordinates:" + location.getY());
		
		Dimension dimension = createacc.getSize();
		System.out.println("height: " + dimension.getHeight()+ "\tWidth: "+ dimension.getWidth());*/
		Rectangle rectangle= createacc.getRect();
        System.out.println("x coordinates: "+rectangle.getX() + "\ty coordinates:" + rectangle.getY());
		
		System.out.println("height: " + rectangle.getHeight()+ "\tWidth: "+ rectangle.getWidth());
		driver.quit();
		

	}

}
