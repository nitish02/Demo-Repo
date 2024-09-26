package logic;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
public class BaseClass 
{
	
	
	
	 
	public static WebDriver driver;
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement x= driver.findElement(By.xpath(""));	
		js.executeScript("argument[0].click();", x);
		js.executeScript("argument[0]value=argument[1]",x, " settext");
	}
	
	public void refresh()
	{
		driver.manage().window().fullscreen();
		driver.navigate().refresh();
	}
	
	public static ArrayList<Object> readExcel() throws Exception
	{
		File f= new File("C:\\Users\\91844\\Downloads\\Cucumber7.xTestNGLatestPOC-master\\Cucumber7.xTestNGLatestPOC-master\\Book1.xlsx");
		FileInputStream file= new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell= row.getCell(1);
		
		ArrayList getCellData= new ArrayList<>();
		 getCellData.add(cell.getStringCellValue());
		System.out.println(getCellData);
		
		return getCellData;
		
	}
	
	
	
	
}
