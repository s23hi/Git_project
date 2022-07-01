package testNG_keyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_method 
{
	//when one method execution is depend upon the other method execution
  @Test
  public void A() 
  {
	 Assert.fail();
	 Reporter.log("A method is running ", true); 
  }
  
  @Test(dependsOnMethods = {"A"})
  public void B()
  {
	  Reporter.log("B method is running", true);
  }
  
  @Test
  public void C()
  {
	  Reporter.log("C method is running", true);
  }
  
  @Test
  public void D()
  {
	  Reporter.log("D method is running", true);
  }
}
