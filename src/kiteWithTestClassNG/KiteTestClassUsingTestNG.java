package kiteWithTestClassNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClassUsingTestNG
{
	KiteLoginPage login;//variable declaration 
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
    Sheet mysheet;
    
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//initialize the data members/variables
		File myfile = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		mysheet=WorkbookFactory.create(myfile).getSheet("Sheet6");
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void LogInToKIte() 
	{
		login.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending Username", true);
		login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending password", true);
        login.clickOnLoginButton();
        Reporter.log("click on login button" , true);
        
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending pin", true);
		pin.clickOnContinueButton();
		Reporter.log("click on continue button", true);

	}
  @Test
  public void validatesUserName() 
  {
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	 
	 String ExpectedUserId = mysheet.getRow(0).getCell(0).getStringCellValue();
	 String actualUserId = home.getActualUserId();
	 Reporter.log("validating userID", true);
	 Assert.assertEquals(ExpectedUserId, actualUserId, "String is not match TC is fail ");
	 Reporter.log("string is match TC is pass", true);
 }
  
  @AfterMethod
  public void LogOutKite() throws InterruptedException
  {
	  home.clickONLogout();
	  Reporter.log("click on log out button", true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
