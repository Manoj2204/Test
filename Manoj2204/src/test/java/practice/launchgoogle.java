package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchgoogle 
{
	WebDriver driver;
	@Test
	public void google() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		driver.quit();
		
	}

}
