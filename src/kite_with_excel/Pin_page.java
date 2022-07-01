package kite_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page 
{
	//1.variable
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;

	//constructor
	public  Pin_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void sendpin(String pin)
	{
		PIN.sendKeys(pin);
	}
	public void clickbutton()
	{
		ContinueButton.click();
	}
}
