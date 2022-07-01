package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(200);
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 Thread.sleep(1000);
		 alt.accept();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 Thread.sleep(1000);
		 Alert alt1 = driver.switchTo().alert();
		 alt1.accept();
 
	}

}
