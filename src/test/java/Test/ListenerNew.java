package Test;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListenerNew implements ITestListener {
	
	
	public void onTestSucess(ITestResult I)
	{
		System.out.println(I);
	}
	
	public void onTestFailure()
	{
		
	}
	
	public void onStart(){
		
	}
	
	public void onFinish()
	{
		
	}
	public void onTestSucess()
	{
		
	}
	
	

}
