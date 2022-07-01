package misclleneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_OF_LInk_study {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        //when we have to find no of webelelment present on webpage of a same tagmane
        List<WebElement> List = driver.findElements(By.tagName("div"));
        System.out.println(List.size());
        
        //print all link using iterator
         Iterator<WebElement> ele = List.iterator();
         while(ele.hasNext())
         {
        	 System.out.println(ele.next().getText());
         }
	}

}
