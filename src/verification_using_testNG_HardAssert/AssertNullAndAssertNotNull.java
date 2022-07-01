package verification_using_testNG_HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndAssertNotNull 
{
  @Test
  public void MyTestCase3() 
  {
	  String s=null;
	  String m="suhi";
	  Assert.assertNull(s, "value is not null TC is failed");
	  Reporter.log("value is null Tc is passed");
  }
}
