package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Practice_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmalertbox")).click();
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt1.getText());
		Thread.sleep(2000);
		alt1.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.name("promptalertbox1234")).click();
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt2.getText());
		Thread.sleep(2000);
		alt2.accept();
	



	}

}
