package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 driver.switchTo().frame("iframe-name");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();

	}

}
