package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimizeFullscreen 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
		

		
	}

}
