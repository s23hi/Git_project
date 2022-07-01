package webelements_methods_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text_study {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.adda247.com/");
		
		//create a reference variable heading to store values
		WebElement heading = driver.findElement(By.xpath("//h1[text()='Govt jobs courses by exams']"));
		System.out.println(heading.getText());
		
		Thread.sleep(3000);
		String actualtext=heading.getText();//create reference variable to store heading value
		//actual text means that text we can see its actually
		String expectedtext = "Govt jobs courses by exams";
		 
		System.out.println(actualtext.equals(expectedtext));//return type is in boolean
		
		//equal method is used to compare a charectors
		//it is a case sensitive
		 if(actualtext.equals(expectedtext))
		 {
			 System.out.println("Test is matching and text case is passed");
		 }
		 else 
		 {
			System.out.println("Test is not matching and test case is failed");
		 }
	   
		

	}

}
