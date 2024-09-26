package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts
{
	@Test
	public void alerts() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(100));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertButton")));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("alertButton")) );
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.findElement(By.id("alertButton")).click();
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.id("timerAlertButton")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("heloo");
		
	}
	
	
	
}
