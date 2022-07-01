package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//variables
	//@FindBy(xpath = "//input[@type='password']") private WebElement PIN;
	@FindBy(id = "pin") private WebElement PIN;//private keyword use for encapsulation
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	//constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//this keyword is used to access global variable to test class
	}
	
	//methods
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}

}
