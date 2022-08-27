package sel_3_3_pom_kite_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Kite_Login_Test {
public static void main(String[]args) throws Throwable {
	
	FileInputStream fis = new FileInputStream("D:\\abc.xlsx");

    Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
    
    System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//-----> To get Url
	D.get("https://kite.zerodha.com/");
//----->For maximize the browser
	D.manage().window().maximize();
//-----> give global wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//-----> calling 1st POM Class
	
	Kite_Login1ddf_Page klp1=new Kite_Login1ddf_Page(D);
	String UserID = sh.getRow(0).getCell(0).getStringCellValue();
	klp1.enterUN(UserID);
	String PassWD = sh.getRow(0).getCell(1).getStringCellValue();
	klp1.enterPWD(PassWD);
	klp1.clickLGNBTN();	
//-----> calling 2nd POM Class	
    Kite_Login2ddf_Page klp2=new Kite_Login2ddf_Page(D);
	String PINvalue=sh.getRow(0).getCell(2).getStringCellValue();
	klp2.enterPIN(PINvalue);
	klp2.clickCONBTN();
//-----> calling 3rd pom Class	
	
    Kite_Home_ddf_Page khp=new Kite_Home_ddf_Page(D);
	String ExpID = sh.getRow(0).getCell(3).getStringCellValue();
	khp.verifyuserID(ExpID);
	
	
	
	
}
}
