import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utlities.ExcelUtil;

public class ExcelWitFB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium_tools\\driver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		cd.get("https://facebook.com");
		
		ExcelUtil ec = new ExcelUtil();
		
		WebElement ele;
		ele = cd.findElement(By.name("email"));
		ele.sendKeys(ec.readInputsString(1, 0));
		
		ele = cd.findElement(By.id("pass"));
		ele.sendKeys(ec.readInputsString(1, 1));
		
		ele = cd.findElement(By.id("u_0_2"));
		ele.click();
		
		
}

	}

