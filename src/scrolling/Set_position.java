package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://vctcpune.com/");
			System.out.println(driver.manage().window().getPosition());
			Point p = new Point(800, 500);
			
			driver.manage().window().setPosition(p);
			
			//to set a position on webpage
		

	}

}
