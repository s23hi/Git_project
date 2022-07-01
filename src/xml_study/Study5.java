package xml_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Study5 
{
  @Test
  public void Test1()
  {
	  Assert.fail();
	  Reporter.log("Test1 method is running", true);
  }
  
  @Test
  public void Test2()
  {
	  Reporter.log("Test2 method is running", true);
  }
  
  @Test
  public void Test3() 
  {
    Assert.fail();
	Reporter.log("Test3 method iss running", true);  
  }
  
  @Test
  public void Test4()
  {
	  Reporter.log("test4 method is running", true);
  }
}
