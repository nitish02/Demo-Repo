package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nestedIframes 
{
	@Test
	public void nesterF()
	{
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		String s=driver.findElement(By.xpath("(//p)")).getText();
		System.out.println(s);
		
		driver.close();
		
	}
	
	
	
		
}
