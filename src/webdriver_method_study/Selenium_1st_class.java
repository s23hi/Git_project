package webdriver_method_study;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1st_class {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//create an object of chromedriver (sub class) and give reference to the webdriver (super class)
		
		driver.get("https://in.bookmyshow.com/");//when we want to open an url then used get method
		
		//driver.close();// only current tab is closed
		//driver.quit();// multiple tabs are close
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.flipkart.com/");//when we have to open new tab or new url then we used navigate method
		driver.navigate().back();
		driver.navigate().forward();//for move to the next tab which is already open
		driver.navigate().refresh();
		
		String title = driver.getTitle();//reference variable value stored in title -->for future used
		System.out.println("title is "+title);
		
		System.out.println(driver.getTitle());//only used for printing
	    System.out.println(driver.getCurrentUrl());
	   String url = driver.getCurrentUrl();//create reference variable for future used
	   System.out.println("url is"+url);
		
				



	}

}
