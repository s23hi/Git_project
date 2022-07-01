package kite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_study {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile=new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.id("userid")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(PWD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.id("pin")).sendKeys(PIN);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
		String Actualtext = userid.getText();
		String ExpectedText = "ELR321";
		if(Actualtext.equals(ExpectedText))
		{
			System.out.println("TC is pass");
		}
		else 
		{
			System.out.println("TC is failed");
		}
		userid.click();

		
        driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		
		
		
		

	}

}
