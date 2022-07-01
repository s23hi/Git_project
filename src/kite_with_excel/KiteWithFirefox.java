package kite_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KiteWithFirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");

	}

}
