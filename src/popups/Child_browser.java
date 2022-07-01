package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.name("NewWindow")).click();
		
		//1.to get a id of main page
		String mainid = driver.getWindowHandle();
		System.out.println("main id is "+mainid);
		
		//2.to get ids of all windows which is receive in set
		Set<String> Allids = driver.getWindowHandles();
		
		//3. we need to convert all set into a array list
		ArrayList<String> ar = new ArrayList<>(Allids);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		//4.we need to switch focus on child id so we pass child id in switch to. window method
		driver.switchTo().window(ar.get(1));
		String text = driver.findElement(By.xpath("//h1[text()='About me']")).getText();
		System.out.println(text);
		
		driver.manage().window().maximize();
		driver.close();//to close only current ie child window
		
	}

}
