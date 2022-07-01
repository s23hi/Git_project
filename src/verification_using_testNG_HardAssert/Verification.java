package verification_using_testNG_HardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification
{
  @Test
  public void MyCaseTest()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
//		if(checkBox1.isSelected())
//		{
//			Reporter.log("TC is passed");
//		}
//		else
//		{
//			Reporter.log("TC is failed");
//		}
		checkBox1.click();
		Assert.assertTrue(checkBox1.isSelected(), "checkbox is not selected TC is failed");
		Reporter.log("check box is selected TC is pass ");
  }
}
