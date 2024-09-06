package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTitleGetCurrentUrl 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("title of webpage= " + title);
		System.out.println("url of webpage= " + url);
	}
}
