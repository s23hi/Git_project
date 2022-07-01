package actions_class_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);//create object of actions class
		//move to element by using mouse action
		WebElement ele = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		a.moveToElement(ele).perform();
		// click by using mouse action
		
		WebElement ele1 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		// 1st way
		//a.moveToElement(ele1).perform();
		//a.click().perform();
		// 2nd way
		//a.moveToElement(ele1).click().build().perform();
        //3rd way
		//a.click(ele1).perform();
		
		//right click--context click
		a.moveToElement(ele1).contextClick().build().perform();
		//a.contextClick(ele1).perform();
	}

}
