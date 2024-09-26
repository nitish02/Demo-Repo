package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class actions 
{

	@Test
	public void nesterF() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("Accepted Elements")).click();
		Actions ac= new Actions(driver);
		//ac.contextClick()
		//.build().perform();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h5[text()='High Tatras 2']")));
		driver.navigate().refresh();
		driver.findElement(By.id("Accepted Elements")).click();
//		ac.clickAndHold(driver.findElement(By.id("draggable")))
//		.moveToElement(driver.findElement(By.id("droppable")))
//		.release();
		Thread.sleep(3000);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
		.perform();
		
		ac.contextClick();
		ac.doubleClick();
		

	}
	
}
