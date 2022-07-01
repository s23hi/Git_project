package actions_class_study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions_study {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("autocomplete"));
		
		Actions a= new Actions(driver);
		
		//a.sendKeys(ele, "Pune").perform();
		
		//a.keyUp(ele, Keys.SHIFT).sendKeys("PUNE").build().perform();//up means upper to lower
		a.keyDown(ele, Keys.SHIFT).sendKeys("pune").build().perform();//down means lower to upper
		
		

	}

}
