package drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement car = driver.findElement(By.id("cars"));//store that drop box in reference variable
		
		Select s = new Select(car);
		
		boolean result = s.isMultiple();
			System.out.println(result)	;
		
	    s.selectByIndex(0);
	    s.selectByIndex(1);
        s.selectByIndex(2);
        
       // s.deselectByVisibleText("Saab");
        
      System.out.println( s.getFirstSelectedOption().getText());
      
      
      System.out.println(s.getAllSelectedOptions().size());//--3
      
      for(int i=0; i<=s.getAllSelectedOptions().size()-1; i++)
      {
    	  System.out.println(s.getAllSelectedOptions().get(i).getText());
      }
      
        
		

	}

}
