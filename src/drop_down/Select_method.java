package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_method {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/signup");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		Thread.sleep(4000);
         
		//1.Identify list box to be handled and store it in reference variable 'month'
        WebElement month = driver.findElement(By.id("SELECTOR_1"));
        
      //2.Create an object of Select class which will accept WebElement as arguments
      //by using select methods
        Select s = new Select(month);
        s.selectByVisibleText("March");
        Thread.sleep(4000);
        s.selectByIndex(4);
        Thread.sleep(4000);
        s.selectByValue("5");
        
        
	}

}
