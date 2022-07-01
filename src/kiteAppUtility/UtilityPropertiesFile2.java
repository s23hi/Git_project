package kiteAppUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class UtilityPropertiesFile2 
{
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
