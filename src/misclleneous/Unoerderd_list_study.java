package misclleneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unoerderd_list_study {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		List<WebElement> SearchREsult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
//		for(WebElement search:SearchREsult)
//		{
//			System.out.println(search.getText());
//		}
		
		Iterator<WebElement> it = SearchREsult.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		String expectedresult = "honda city";
		for(WebElement search:SearchREsult)
		{
			String actualresult = search.getText();
			if( actualresult.equals(expectedresult))
			{
				search.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();
		
				
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
