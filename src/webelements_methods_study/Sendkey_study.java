package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey_study {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Suhani123");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
	

	}

}
