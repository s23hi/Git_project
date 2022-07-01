package kite_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page
{
	//variables
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LOGoutButton;
	
	//constructor
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	
	public void validateuserid(String expectedusername)
	{
		String actualuserid = UserId.getText();
		String expecteduserid = expectedusername;
		
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("Tc is failed");
		}
	}
	
	public void clickonloginbutton()
	{
		UserId.click();
		LOGoutButton.click();
	}

	
}
