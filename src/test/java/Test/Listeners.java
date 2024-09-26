package Test;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
	public void onTestSuccess(ITestResult i)
	{
		System.out.println("INSIDE ON TEST SUCCESS"+i);
	}
}
