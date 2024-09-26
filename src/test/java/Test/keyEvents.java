package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyEvents 
{

	@Test
	public void keyEvents() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");

		
		Actions action= new Actions(driver);
		
		action.sendKeys(driver.findElement(By.xpath("//input[@id='s']")),Keys.SHIFT)
		.sendKeys("A").build().perform();
		
		action.keyDown(driver.findElement(By.xpath("//input[@id='s']")), Keys.SHIFT).sendKeys("sfgeufg").build().perform();


	}



}
