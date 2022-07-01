package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1
{
  @Test
  public void Test()
  {
	  Assert.fail();
	  Reporter.log("my name is test", true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("my name is test2", true);
  }
}
