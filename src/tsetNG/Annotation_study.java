package tsetNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study
{

  @Test//it is used for execution of test method or test case
  public void Test() 
  {
	  Reporter.log("Test method is running", true);
  }
  
  @Test
  public void Test1()
  {
	  Reporter.log("Test1 method is running", true);
  }
  
  @BeforeMethod//it is used for execution of method before execution of every test method
  public void Login()
  {
	  Reporter.log("before method is running", true);
  }
  
  @AfterMethod//it is used for execution of method after execution of every test method 
  public void Logout()
  {
	  Reporter.log("after method is running", true);
  }
  
  @BeforeClass//it is used for execution of method before execution of test class
  public void LunchedBrowser()
  {
	 Reporter.log("before class is running", true); 
  }
  
  @AfterClass//it is used for execution of method after execution of test class
  public void CloseBrowser()
  {
	  Reporter.log("after class is running", true);
  }
  
  
  
  
  
  
  
  
}
