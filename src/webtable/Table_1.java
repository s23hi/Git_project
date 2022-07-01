package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://m.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> column = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/table/thead/tr/th"));

        System.out.println(column.size());
		

	}

}
