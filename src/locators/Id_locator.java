package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_locator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).click();
		//id locator which is present in input field 

	}

}
