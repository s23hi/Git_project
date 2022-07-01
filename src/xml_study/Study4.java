package xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Study4
{
  @Test(groups = "sanity")
  public void Test5() 
  {
	Reporter.log("Test5 sanity method is running", true);
  }
  
  @Test
  public void Test6() 
  {
	 Reporter.log("Test6 method is running", true); 
  }
  
  @Test(groups = "regression")
  public void Test7()
  {
	  Reporter.log("Test7 regression method is running", true);
  }
  
  @Test(groups = "regression")
  public void Test8()
  {
	  Reporter.log("Test8 regression method is running", true);
  }
  
  @Test(groups = "sanity")
  public void Test9()
  {
	  Reporter.log("Test9 sanity method is running", true);
  }
}
