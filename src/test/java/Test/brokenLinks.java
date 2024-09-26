package Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

public class brokenLinks
{

		@Test
		public void brkoe()
		{
			
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.get("https://demoqa.com/links");
			driver.manage().window().maximize();
			
			List<WebElement> l=driver.findElements(By.tagName("a"));
			System.out.println("size"+l.size());
			Iterator<WebElement>it= l.iterator();
			for(int i=1;i<l.size();i++)
			{
				
				if(it.next().getText()=="")
				{
					System.out.println("broken");
				}
				else
				{
					System.out.println(l.get(i).getText());
				}
			}
			System.out.println();
		
		}
	
	
	
}
