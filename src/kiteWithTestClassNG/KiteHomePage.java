package kiteWithTestClassNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//variables
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOut;
	
	//constructor
	public KiteHomePage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String getActualUserId()
	{
		String actualUserId = UserID.getText();
		return actualUserId;
	}
	
	public void validateUserId(String expecteduserid)
	{
		String actualUserId = UserID.getText();
		String ExpectedUserId = expecteduserid;
		
		if(actualUserId.equals(ExpectedUserId))
		{
			System.out.println("TC is pass");
		}
		else
		{
			System.out.println("Tc is fail");
		}
				
	}
	public void clickONLogout() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(1000);
		logOut.click();
	}
	
	

}
