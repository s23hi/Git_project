package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrolling_study {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
	//driver.manage().window().maximize();
		// +ve x value--> right hand side, Y value +ve --> down 
        // +ve x value--> right hand side, Y value -ve --> up 
	    // -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 

       //type cast driver object into the javascript executor
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(6000);
		j.executeScript("window.scrollBy(80,-900)");//X=80 (straight line),Y=900(up and down line)
		Thread.sleep(6000);
		j.executeScript("window.scrollBy(10,-900)");





	}

}
