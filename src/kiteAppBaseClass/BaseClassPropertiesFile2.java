package kiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityusingPropertiesFile;
//import net.bytebuddy.utility.RandomString;

public class BaseClassPropertiesFile2
{
	protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(UtilityusingPropertiesFile.getDataFromPropertyFile("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void takeScreenshot(String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String A = RandomString.make(3);
		File des = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Screenshot\\validatesUID"+TCName+".png");
		FileHandler.copy(src, des);
	}


}
