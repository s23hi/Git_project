package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_text {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
//        // x-path by text
//       driver.get("https://kite.zerodha.com/");
//       driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
//       
//       // contains with text
//       driver.findElement(By.xpath("//a[contains(text(),'Don')]")).click();
//        driver.navigate().forward();
//        
//        //contains with attributes
//       driver.get("https://www.redbus.in/");
//      // driver.navigate().forward();
//       driver.findElement(By.xpath("//button[contains(@id,'se')]")).click();
//     
       //x-path by attribute
       driver.get("https://vctcpune.com/selenium/practice.html");
       
       driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("suhi");
	}

}
