package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class MyTestNGClass
{
  @Test
  public void Test1()
  {
	  Assert.fail();
	  Reporter.log("My test case", true);
  }
  @Test(dependsOnMethods = "Test1")
  public void Test2()
  {
	  Reporter.log("Hello", true);
  }
}
