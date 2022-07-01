package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
          
		KiteLoginPage login = new KiteLoginPage(driver);
		login.SendUserName();
		login.SendPassword();
		login.ClickOnLOginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KitePinPage pin = new KitePinPage(driver);
		pin.sendpin();
		pin.clickoncontinuebutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage homepage= new KiteHomePage(driver);
		homepage.validateuserid();
		homepage.clickonuserid();
		homepage.clickonlogout();
	}

}
