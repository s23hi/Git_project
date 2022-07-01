package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");//main webPage
		driver.manage().window().maximize();
        Thread.sleep(200);
        driver.switchTo().frame("frame1");//parent frame
        Thread.sleep(200);
        WebElement child = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));//find locator for child frame
        driver.switchTo().frame(child);//switch on child frame
        Thread.sleep(200);
        String text = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        Thread.sleep(200);
        System.out.println(text);
        driver.switchTo().parentFrame();//switch to parent frame
        Thread.sleep(200);
        String text2 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        System.out.println(text2);
        Thread.sleep(200);
        driver.switchTo().defaultContent();//switch to main webPage
        Thread.sleep(200);
        String text3 = driver.findElement(By.className("main-header")).getText();
        System.out.println(text3);
        
	}

}
