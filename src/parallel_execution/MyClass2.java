package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2
{
  @Test
  public void method1() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://vctcpune.com/");
	  driver.manage().window().maximize();
	  Reporter.log("my method1 is running", true);
  }
}
