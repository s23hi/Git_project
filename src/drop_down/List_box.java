package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/signup");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		Thread.sleep(4000);
		
		WebElement day = driver.findElement(By.id("SELECTOR_2"));
		
		 Select s = new Select(day);
		 Thread.sleep(4000);
		 
		 s.selectByVisibleText("5");
		 
		 for(int i=1; i<=15; i++)
		 {
			 s.selectByIndex(i);
			
		 }
		 
		 boolean result = s.isMultiple();
		 System.out.println("multiple selection result is "+result);
		 
		 for(int i=0; i<=30; i++)
		 {
			 System.out.println(s.getOptions().get(i).getText());
		 }
			 
		 

	}

}
