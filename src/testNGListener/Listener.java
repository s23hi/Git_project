package testNGListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseClassPropertiesFile2;

public class Listener implements ITestListener
{
	
	BaseClassPropertiesFile2 b = new BaseClassPropertiesFile2();//object created for base class
	//onTestFail
	//onTestPass
	//onTestSucess
	//onTestSkip
	
//	@Override
//	public void onTestFailure(ITestResult result) 
//	{
//		Reporter.log("TC is failed, Screenshot taken", true);
//		ITestListener.super.onTestFailure(result);
//		Reporter.log("failed test case name is "+result.getName(),true);
//	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String TestCaseName = result.getName();
		try {
			b.takeScreenshot(TestCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
      Reporter.log("TC is passed", true);		
      ITestListener.super.onTestSuccess(result);
      Reporter.log("pass TC name is "+result.getName(), true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
      Reporter.log("TC is skiped,please check dependent TC", true);		
      ITestListener.super.onTestSkipped(result);
	}
	

}
