package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Time_out_use
{
	
	//If test class contains multiple test methods if one of the test method is time 
	//consuming to execute then TestNG by default fail that TC & executes the other TC.
	
  @Test(timeOut = 1500)
  public void A() throws InterruptedException
  {
	  Thread.sleep(1200);
	  Reporter.log("A method is running", true);
  }
  
  @Test
  public void B()
  {
	  Reporter.log("B method is running", true);
  }
  
  @Test
  public void C()
  {
	  Reporter.log("C is running", true);
  }
  
}
