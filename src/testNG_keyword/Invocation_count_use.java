package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Invocation_count_use 
{
  @Test(invocationCount = 3)//when we want executed same test cases multiple times then we used it
  public void Test() 
  {
	  Reporter.log("Test method is running", true);
  }
  
  @BeforeClass
  public void LunchedBrowser()
  {
	  Reporter.log("before class is running", true);
  }
}
