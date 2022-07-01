package testNGListener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{
  @Test
  public void class1()
  {
	Reporter.log("my name is class1", true);
  }
  @Test
  public void class2()
  {
	  Reporter.log("my name is class2", true);
  }
}
