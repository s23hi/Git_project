package kite_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	//1 variables
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id = "password")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;

	//constructor
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void sendusername(String username)
	{
		UN.sendKeys(username);
	}
	public void sendpassword(String password)
	{
		PWD.sendKeys(password);
	}
	public void clickloginbutton()
	{
		loginbutton.click();
	}
}

