package sel_3_1_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class With_DDF {
	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("D:\\abc.xlsx");
//		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
        Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//-----> To get Url
		driver.get("https://kite.zerodha.com/");
//----->For maximize the browser
		driver.manage().window().maximize();
//-----> give global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//-----> To enter the user name
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
//----->To enter password
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
//-----> To click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
//----->To enter pin
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);		
//-----> To click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();		
//-----> verify user id
		String expID = sh.getRow(0).getCell(3).getStringCellValue();
		String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();

		if (expID.equals(actID)) {
			System.out.println("Test Case is pass");
		} else {
			System.out.println("Test Case is fail");
		}

	}
}
