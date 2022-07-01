package kiteAppTestClassNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClass;
import kiteAppUtility.UtilityClass;
import kiteWithTestClassNG.KiteHomePage;
import kiteWithTestClassNG.KiteLoginPage;
import kiteWithTestClassNG.KitePinPage;

public class ValidatesKiteUserId extends BaseClass
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
  @BeforeClass
  public void launchedBrowser() 
  {
	 openBrowser();
	 login= new KiteLoginPage(driver);
	 pin = new KitePinPage(driver);
	 home = new KiteHomePage(driver);
  }
  @BeforeMethod
  public void logintokiteapp() throws EncryptedDocumentException, IOException
  {
	  login.sendUserName(UtilityClass.readDataFromExcel(0, 0));
	  login.sendPassword(UtilityClass.readDataFromExcel(0, 1));
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.sendPin(UtilityClass.readDataFromExcel(0, 2));
	  pin.clickOnContinueButton();
  }
  @Test
  public void validateUseName() throws EncryptedDocumentException, IOException
  {
	  String actualusername = home.getActualUserId();
	  String expectedUsername = UtilityClass.readDataFromExcel(0, 0);
	  
	  Assert.assertEquals(actualusername, expectedUsername, "Username is not match TC is fail");
	  Reporter.log("username is match TC is pass", true);
	  UtilityClass.takeScreenshot(driver);
  }
  @AfterMethod
  public void logOutKiteApp() throws InterruptedException
  {
	  home.clickONLogout();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}


















