package Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Listeners(ListenerNew.class) 
public class TestngData 
{
	@Test(enabled= true, priority=-20)
	@Parameters({"newurl"})
	
	public void setup(String n) throws Exception
	{
		
	Properties prop= new Properties();
	
	FileReader file= new FileReader("C:\\Users\\91844\\Downloads\\Cucumber7.xTestNGLatestPOC-master\\Cucumber7.xTestNGLatestPOC-master\\src\\test\\java\\Test\\pro.properties");
	
	prop.load(file);
	
	prop.getProperty("url");
	System.out.println(n);
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println(prop.getProperty("url"));
	driver.get(prop.getProperty("url"));
	
	
	
	
	
	}




}
