package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_2 {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://unacademy.com/");
		
		WebElement head = driver.findElement(By.xpath("//h5[text()='UPSC CSE - GS']"));
		
		System.out.println(head.getText());

		String actualtext = head.getText();
		String expectedtext = "UPSC CSE - GS";
				               
		
		System.out.println(actualtext.equals(expectedtext));
		if( actualtext.equals(expectedtext))
		{
			System.out.println("text is matching and tc is passsed");
	    }
		else
		{
			System.out.println("text is not matching and tc is failed ");
		}

	}

}
