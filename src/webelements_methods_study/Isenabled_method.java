package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zee5.com/signin");
		
		//driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(10000);
		
		WebElement loginbutton = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		Thread.sleep(100);
		
		 boolean result = loginbutton.isEnabled();
		 System.out.println("result is "+result);
		 
		 driver.findElement(By.name("userName")).sendKeys("1234567898");
		 Thread.sleep(10);
		 
		 boolean result1 = loginbutton.isEnabled();
		 System.out.println("result is "+result1);

		
	}

}
