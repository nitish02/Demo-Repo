package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class windowsHandling 
{

	@Test
	public void handleeverything() throws InterruptedException
	{
			
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(100));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("windowButton")));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("windowButton")) );
		driver.findElement(By.id("windowButton")).click();
		Set<String> nw=driver.getWindowHandles();
		System.out.println(nw);
		Iterator<String>i=nw.iterator();
		//ArrayList<String> aL= new ArrayList<String>();
		
		i.next(); //first window
		String sChild=i.next(); //second window
		driver.switchTo().window(sChild);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		driver.close();
		
	}



}
