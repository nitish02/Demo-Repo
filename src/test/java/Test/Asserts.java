package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Asserts {

	
	@Test
	public void testAsserts()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/testng/testng-asserts/");
		String title=driver.getTitle();
		SoftAssert s= new SoftAssert();
		s.assertEquals(s, "s");
		
		s.assertAll();
		//Assert.ass
	}
	
	
	
}
