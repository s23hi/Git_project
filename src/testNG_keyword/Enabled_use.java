package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_use 
{
  @Test(enabled = false)//when we want to disabled a test case then we used enabled keyword
  public void A() 
  {
	  Reporter.log("A is running", true);
  }
  
  @Test(enabled = false)
  public void B()
  {
	  Reporter.log("B is running", true);
  }
  
  @Test
  public void C()
  {
	  Reporter.log("C is running", true);
  }
  
  @Test
  public void D()
  {
	  Reporter.log("D is running", true);
  }
}
