package soft_assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.netty.util.AsciiString;

public class Equal_notEqual 
{
	SoftAssert soft = new SoftAssert();
	
	
  @Test
  public void TestCase() 
  {
	  String s="suhani";
	  String s1="suhani";
	  String s2="suhi";
	  
	  soft.assertEquals(s, s1, "String are not matched TC is fail");
	  soft.assertNotEquals(s, s2, "String are matched TC is failed");
	  soft.assertAll();
  }
  @Test
  public void Testcase1()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  soft.assertTrue(a, "value is false TC is fail");
	  soft.assertFalse(b, "value is true tc is fail");
	  soft.assertAll();
  }
  
  @Test
  public void TestCase2()
  {
	  String s=null;
	  String s3="suhi";
	  
	  soft.assertNull(s, "value is not null TC is fail");
	  soft.assertNotNull(s3, "value is null TC is fail");
	  soft.assertAll();
	  
  }
  
  
  
  
  
  
  
}
