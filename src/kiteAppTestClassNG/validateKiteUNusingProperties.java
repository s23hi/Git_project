package kiteAppTestClassNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassPropertiesFile;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityusingPropertiesFile;

public class validateKiteUNusingProperties extends BaseClassPropertiesFile
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		openBrowser();
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}
	@BeforeMethod
	public void logIntoKite() throws IOException
	{
		login.sendUserName(UtilityusingPropertiesFile.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityusingPropertiesFile.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		pin.sendPin(UtilityusingPropertiesFile.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		UtilityusingPropertiesFile.implicitywait(driver, 1000);
	}
   @Test
   public void validateUserId() throws IOException
   {
	   String actualuserID = home.getActualUserId();
	   String expecteduserID = UtilityusingPropertiesFile.getDataFromPropertyFile("UN");
	   
	   Assert.assertEquals(actualuserID, expecteduserID,"result is not match TC is fail ");
	   Reporter.log("result is match TC is pass", true);
	   UtilityusingPropertiesFile.takeScreenshot(driver);
   }
   @AfterMethod
   public void logOutKite() throws InterruptedException
   {
	   home.clickONLogout();
   }
   @AfterClass
   public void closeBrowser()
   {
	   driver.close();
   }
	   
   
}
