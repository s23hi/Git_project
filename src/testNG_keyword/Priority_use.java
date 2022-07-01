package testNG_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_use 
{
	//on priority bases test method/test cases can be executed
	//0 -ve +ve duplicate
  @Test(priority = -3)//when we want change test case execution order then we used it 
  public void D() 
  {
	  Reporter.log("D is running", true);
  }
  
  @Test(priority = 3)
  public void B()
  {
	  Reporter.log("B is running", true);
  }
  
  @Test(priority = 1)
  public void C()
  {
	  Reporter.log("C is running", true);
  }
  
  @Test(priority = 2)
  public void A()
  {
	  Reporter.log("A is running", true);
  }
  
  
}
