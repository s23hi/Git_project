package xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Study3
{
  @Test(groups = "sanity")
  public void Test1() 
  {
	Reporter.log("Test1 sanity method is running", true);  
  }
  
  @Test
  public void Test2() 
  {
	Reporter.log("Test2 method is running", true);  
  }
  
  @Test(groups = "regression")
  public void Test3()
  {
	  Reporter.log("Test3 regression method is running", true);
  }
  
  @Test(groups = "regression")
  public void Test4()
  {
	  Reporter.log("Test4 regression method is running", true);
  }
  
}
