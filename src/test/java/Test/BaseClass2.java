package Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class BaseClass2 
{
	static WebDriver driver2;
	public static WebDriver init() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/selenium-rc-tutorial");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("__________________________________________");
		System.out.println("__________________________________________");
		System.out.println("__________________________________________");
		System.out.println("__________________________________________");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("__________________________________________");
		System.out.println("__________________________________________");
		System.out.println("__________________________________________");
		
		driver.findElement(By.xpath("//button[text()='Contact Sales']")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().refresh();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//button[text()='Contact Sales']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Get Started free")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_full_name")));
		
		Wait w= new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
				w.until(ExpectedConditions.alertIsPresent());
				
				  Wait<WebDriver> waitx = new FluentWait<WebDriver>(driver)
					       .withTimeout(Duration.ofSeconds(30L))
					       .pollingEvery(Duration.ofSeconds(5L))
					       .ignoring(NoSuchElementException.class);
		driver.close();
		
		
		return driver;
		
	}
	
	
	


}
