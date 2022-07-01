package tsetNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_class {
  @Test
  public void mymethod()
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
  }
  @Test
  public void mymethod2()
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/difference-between-static-and-dynamic-testing/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().window().maximize();
        Reporter.log("Method2 is running");//reporter is a class nd log is a static method
        //only shown in console 
        
  }
  @Test
  public void mymethod3()
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://calendar.google.com/calendar/u/0/r?tab=rc");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().window().maximize(); 
        Reporter.log("method 3 is running", true);//if true shown in both console nd report
  }
}
