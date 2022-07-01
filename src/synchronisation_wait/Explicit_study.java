package synchronisation_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_study {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		 WebElement home = driver.findElement(By.xpath("//a[@title='w3schools.com Home']"));
		
		w.until(ExpectedConditions.visibilityOf(home));
		
		home.click();
		
		//WebDriverWait w1 = new WebDriverWait(driver, Duration.ofMinutes(3));
		//WebElement search = driver.findElement(By.xpath("//a[text()='Log in']"));
		//w1.until(ExpectedConditions.visibilityOf(search));
		//search.click();
		
		//a[@title='w3schools.com Home']
	}

}
