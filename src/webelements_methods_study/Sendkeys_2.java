package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://zoom.us/signin");
		driver.manage().window().maximize();
		
		//create a reference variable of webelement
		WebElement userId = driver.findElement(By.xpath("//input[@name='email']"));
		
		userId.sendKeys("suhanihajare420@gmail.com");//this method is used to enter a value in text field
		//userId.clear();//this method is used to clear a value in text field
		Thread.sleep(1000);//our selenium tool works to fast and as compare to that our browser works to slow ie we used thread.sleep method for loading a browser
		
		driver.findElement(By.name("password")).sendKeys("12345");//name locator is used for find a locator name password
		Thread.sleep(3000);
        driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
        Thread.sleep(1000);

		
	}

}
