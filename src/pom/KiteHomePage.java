package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1.data members
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LOGoutButton;
	
	//2.constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods
	public void validateuserid()
	{
		String actualuserid = UserId.getText();
		String expecteduserid = "ELR321";
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("result is match tc is passed");
		}
		else
		{
			System.out.println("result is not matched tc is failed");
		}
	}
	public void clickonuserid()
	{
		UserId.click();
	}
	
	public void clickonlogout()
	{
		LOGoutButton.click();
	}

}
