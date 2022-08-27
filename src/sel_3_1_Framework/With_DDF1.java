package sel_3_1_Framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class With_DDF1 {
public static void main(String[] args) throws Throwable {
	
	FileInputStream fis1=new FileInputStream("C:\\Users\\Nilesh Patil\\Desktop\\abc.xlsx");
	Sheet ws = WorkbookFactory.create(fis1).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	//-----> To get Url
			d.get("https://kite.zerodha.com/");
	//----->For maximize the browser
			d.manage().window().maximize();
	//-----> give global wait	    
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String UN = ws.getRow(0).getCell(0).getStringCellValue();
			d.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
			
			
	
}
}
