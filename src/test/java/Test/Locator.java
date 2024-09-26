package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Locator
{
	@Test
	public void checkLocators() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		try {
		driver.get("https://www.saucedemo.com/inventory-item.html?id=5");
		driver.findElement(By.xpath(""));
		driver.findElement(By.id(""));
		driver.findElement(By.name(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.partialLinkText(null));
		driver.findElement(By.tagName("html"));
		driver.findElement(By.cssSelector(".inputclass"));
		driver.findElement(By.className("f"));
		}
		catch(Exception e)
		{
			driver.manage().window().maximize();
		}
		finally
		{
			System.out.println("finally block");
		}
		
		List<WebElement> list=driver.findElements(By.tagName("input"));
		for(WebElement x:list)
		{
			System.out.println(x);
			System.out.println(x.getAttribute("placeholder"));
		}
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Actions ac= new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
	
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
		Select s= new Select(driver.findElement(By.className("product_sort_container")));
		s.selectByVisibleText("Price (low to high)");
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.navigate().refresh();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("product_sort_container")));
		driver.navigate().refresh();
		s= new Select(driver.findElement(By.className("product_sort_container")));
		s.selectByVisibleText("Name (Z to A)");
		//s.select
		driver.quit();
		
	}
	



}
