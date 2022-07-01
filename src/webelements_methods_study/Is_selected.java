package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Radio4']"));
		boolean result = radiobutton.isSelected();
		
		System.out.println(result);
		
		if(radiobutton.isSelected())
		{
			System.out.println("radiobox is already selected");
			
		}
		else
		{
			System.out.println("select a radiobutton");
			radiobutton.click();
			if(radiobutton.isSelected())
			{
				System.out.println("radiobutton is selected");
				
			}
			else {
				System.out.println("failed to select radiobutton");
			}
		}
		
	    



	}

}
