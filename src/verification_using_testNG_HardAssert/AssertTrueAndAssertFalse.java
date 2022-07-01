package verification_using_testNG_HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  AssertTrueAndAssertFalse 
{
  @Test
  public void testCase() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	  //when both method is true then both are executed 
	  //but if one method is false then it stop the other method from execution
	  
	 // Assert.assertTrue(b, " value is false TC is failed");
	 // Reporter.log("value is true TC is PASSED", true);
	  
	  Assert.assertFalse(b, "value is true TC is failed");
	  Reporter.log("value is false TC is PASSED",true);
  }
}
