package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		boolean result = textbox.isDisplayed();
		System.out.println("textbox is displayed- "+result);
		
		if(textbox.isDisplayed())
		{
			System.out.println("textbox is displayed");
		}
		else
		{
			System.out.println("displayed the textbox");
		}
		textbox.sendKeys("suhani");
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		hidebutton.click();
		
		boolean result1 = textbox.isDisplayed();
		System.out.println("textbox is displayed -"+result1);
		

	}

}
