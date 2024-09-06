package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String pagesource = driver.getPageSource();
		System.out.println("pagesource of webpage"+pagesource);
		

	}

}
