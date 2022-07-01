package kiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityusingPropertiesFile
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String A = RandomString.make(3);
		File des = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Screenshot\\validatesUID"+A+".png");
		FileHandler.copy(src, des);
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties pro = new Properties();
		FileInputStream mypro = new FileInputStream("C:\\Users\\SUHANI\\eclipse-workspace\\Project Selenium\\Myfile.properties");
		pro.load(mypro);
		String value = pro.getProperty(key);
		return value;
	}
	public static void implicitywait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

	

}
