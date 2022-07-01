package screenshot_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class With_Random_name {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://unacademy.com/explore");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	   //to take screenshot in multiple times
		String random=RandomString.make(3);
		
		File destination = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Screenshot\\takescreenshot"+random+".png");
		
		//by using copy method in FileHandler class
		FileHandler.copy(source, destination);
		
		
		
		

	}

}
