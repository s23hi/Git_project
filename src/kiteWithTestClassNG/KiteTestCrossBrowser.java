package kiteWithTestClassNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestCrossBrowser 
{
	KiteLoginPage login1;//variable declaration 
	KitePinPage pin1;
	KiteHomePage home1;
	WebDriver driver;
    Sheet mysheet;
    
    @Parameters("browser")
    
    @BeforeClass
    public void LaunchedBrowser1(String browser) throws EncryptedDocumentException, IOException
    {
		if(browser.equals("chrome"))
		{
    	  System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
	      driver = new ChromeDriver();
		  driver.get("https://kite.zerodha.com/");

	    }
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.get("https://kite.zerodha.com/");

		}
		//driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//initialize the data members/variables
		File myfile = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		mysheet=WorkbookFactory.create(myfile).getSheet("Sheet6");
		login1 = new KiteLoginPage(driver);
		pin1 = new KitePinPage(driver);
		home1 = new KiteHomePage(driver);
    }
    @BeforeMethod
    public void LogintoKite1()
    {
    	login1.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending Username", true);
		login1.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending password", true);
        login1.clickOnLoginButton();
        Reporter.log("click on login button" , true);
        
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        pin1.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending pin", true);
		pin1.clickOnContinueButton();
		Reporter.log("click on continue button", true);
    }

   @Test
   public void validateuserid()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 
		 String ExpectedUserId = mysheet.getRow(0).getCell(0).getStringCellValue();
		 String actualUserId = home1.getActualUserId();
		 Reporter.log("validating userID", true);
		 Assert.assertEquals(ExpectedUserId, actualUserId, "String is not match TC is fail ");
		 Reporter.log("string is match TC is pass", true);
	 }  
   @AfterMethod
   public void logOutKite1() throws InterruptedException
   {
	   home1.clickONLogout();
	   Reporter.log("click on log out button", true);
   }
   @AfterClass
   public void closebrowser1()
   {
	   driver.close();
   }
   }

