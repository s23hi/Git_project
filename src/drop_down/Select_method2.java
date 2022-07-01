package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_method2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(2000);
		
		//first we have to find list box by locators nd store it in reference variable
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		
		//create an object of select class and pass argument ie webelement
		Select s = new Select(year);
		
		//by using any select method call value from list box
		s.selectByVisibleText("2020");
		
		boolean result = s.isMultiple();
		System.out.println("multiple option is selected in year drop down -- "+result);
		
		for(int i=0; i<=10; i++)
		{
			System.out.println(s.getOptions().get(i).getText());
			s.selectByIndex(i);
		}
		

	}

}
