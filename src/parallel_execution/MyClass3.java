package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass3 
{
  @Test
  public void method2()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://paytm.com/");
	  driver.manage().window().maximize();
	  Reporter.log("my method2 is running", true);
  }
}
