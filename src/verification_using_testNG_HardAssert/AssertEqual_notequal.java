package verification_using_testNG_HardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual_notequal 
{
  @Test
  public void MyTestCases()
  {
	  String s="suhani";
	  String s1="suhani";
	  String s2="suhi";
	  
	  Assert.assertEquals(s, s1,"string are not matching TC is failed");
	  Reporter.log("String are matching TC is pass");
  }
  @Test
  public void MyTestCases1()
  {
	  String s="suhani";
	  String s1="suhani";
	  String s2="suhi";
	  
	  Assert.assertNotEquals(s1, s2, "String are matching Tc is fail");
	  Reporter.log("String are not matching TC is pass");
  }
  
}
