package kite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_study {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
        WebElement userId = driver.findElement(By.id("userid"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        
        userId.sendKeys("ELR321");
        pass.sendKeys("Dhana1111");
        loginbutton.click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        WebElement pin = driver.findElement(By.id("pin"));
        pin.sendKeys("982278");
        WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
        continuebutton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        WebElement uid = driver.findElement(By.xpath("//span[@class='user-id']"));
        String actualresult = uid.getText();
        String expectedresult = "ELR321";
        
        if(actualresult.equals(expectedresult))
        {
        	System.out.println("result matching tc is passed");
        }
        else
        {
        	System.out.println("result is not matching tc s failed");
        }
        uid.click();
        driver.findElement(By.xpath("//a[@target='_self']")).click();
        Thread.sleep(1000);

        driver.close();
		
		

	}

}
