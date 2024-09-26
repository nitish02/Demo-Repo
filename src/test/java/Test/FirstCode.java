package Test;



import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import logic.BaseClass;

public class FirstCode extends BaseClass

{

		@BeforeSuite
		public void beforeS()
		{
			System.out.println("BEFORE SUITE");
		
		}
		
		@AfterSuite
		public void afters()
		{
			System.out.println("AFTER SUITE");
		}
		
		@BeforeClass
		public void beforeC()
		{
			System.out.println("BEFORE CLASS");
		}
		
		@AfterClass
		public void afterC()
		{
			System.out.println("AFTER CLASS");
		}
		@BeforeMethod
		public void beforeM()
		{
			System.out.println("BEFORE METHOD");
		}
		
		@AfterMethod
		public void afterM()
		{
			System.out.println("AFTER METHOD");
			driver.close();
		}
		
		@BeforeTest
		public void beforeT()
		{
			System.out.println("BEFORE TEST");
		}
		
		@AfterTest
		public void afterT()
		{
			System.out.println("AFTER TEST");
		}
//		@Test(priority=2)
//		public void prints()
//		{
//			System.out.println("test1");
//			init();
//		}

		@DataProvider
		public Iterator<Object> readxl() throws Exception
		{
			
			
			 return readExcel().iterator();
			
		}
		
		@Test(priority=1,
				//dependsOnMethods="prints", 
				//expectedExceptions = ArithmeticException.class,
			//	timeOut = 10000,
			//	invocationCount = 1,
				dataProvider="readxl"
				)
	//	@Parameters({"url","browser"})
		
		public void prints2(String u)
		{
			init();
			System.out.println("test2");
		//	System.out.println(url);
		//	System.out.println(browser);
			
		//	init();
		//	refresh();
		//	int i=2/0;
			}



}
