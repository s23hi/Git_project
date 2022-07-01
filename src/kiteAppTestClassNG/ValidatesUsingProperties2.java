package kiteAppTestClassNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAppBaseClass.BaseClassPropertiesFile2;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityPropertiesFile2;

@Listeners(testNGListener.Listener.class)
	public class ValidatesUsingProperties2 extends BaseClassPropertiesFile2
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
			login.sendUserName(UtilityPropertiesFile2.getDataFromPropertyFile("UN"));
			login.sendPassword(UtilityPropertiesFile2.getDataFromPropertyFile("PWD"));
			login.clickOnLoginButton();
			pin.sendPin(UtilityPropertiesFile2.getDataFromPropertyFile("PIN"));
			pin.clickOnContinueButton();
			UtilityPropertiesFile2.implicitywait(driver, 1000);
		}
	   @Test
	   public void validateUserId() throws IOException
	   {
		   String actualuserID = home.getActualUserId();
		   String expecteduserID = UtilityPropertiesFile2.getDataFromPropertyFile("UN1");
		   
		   Assert.assertEquals(actualuserID, expecteduserID,"result is not match TC is fail ");
		   Reporter.log("result is match TC is pass", true);
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