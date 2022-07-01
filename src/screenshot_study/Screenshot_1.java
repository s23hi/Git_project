package screenshot_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://unacademy.com/explore");
		
		//1. we have to type cast driver object into the takesScreenshot interface
		//2. by passing arguments outputtype.file
		//store it in a reference variable.
		//this method return object in a FILE.
		
		//store it in a reference variable
		//screenshot store in a source object but we don't know about source object 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// we have to copy screenshot from source to destination -->which is created by us to store a screenshot
		
		File destination = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Screenshot\\myscreenshot.png");
		
		// for copy screenshot we need to call copy file method -->method of FileHandler class
		FileHandler.copy(source, destination);
		

	}

}
