package Test;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngB 
{
		@BeforeSuite
		public void before_suite() {
			System.out.println("before suite");
		}
		@BeforeTest
		public void before_suite2() {
			System.out.println("before test");
		}
		@BeforeClass
		public void before_suite3() {
			System.out.println("before class");
		}
		@BeforeMethod
		public void before_suite4() {
			System.out.println("before method");
		}
		
		@Test(invocationCount=1, timeOut = 1000, enabled=true, groups="hh")
		public void btest() {
			System.out.println("test");
		}
		
		@Test(enabled= true, dependsOnMethods="btest")
		public void btest2() {
			System.out.println("TEST2");
		}
		
		@Test(enabled= true, dependsOnMethods="btest", groups={"test", "hh"})
		public void btest3() {
			System.out.println("TEST2");
		}
	
		@AfterSuite()
		public void after1() {
			System.out.println("after suite");
		}
		@AfterTest
		public void after2() {
			System.out.println("before test");
		}
		@AfterClass
		public void after3() {
			System.out.println("before class");
		}
		@AfterMethod
		public void after4() {
			System.out.println("before method");
		}


		@Test(enabled=true, groups="hh")
		@Parameters({"url", "newurl"})
		public void parameters(String s, String ns)
		{
			System.out.println("url"+s+"/n"+"new url"+ns);
		}

}
