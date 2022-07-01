package kiteWithTestClassNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{

	//variables
	@FindBy(xpath = "//input[@type='text']") private WebElement UN;
	@FindBy(xpath = "//input[@type='password']") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	//constructor
	public  KiteLoginPage ( WebDriver driver) 
	{
		PageFactory.initElements(driver, this);//PageFactory is a class and initElement is a static method
		                                       //which is used to initialize the webelement

	}
	
	//methods
	public void sendUserName(String username)
	{
		UN.sendKeys(username);
	}
	
	public void sendPassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
}
