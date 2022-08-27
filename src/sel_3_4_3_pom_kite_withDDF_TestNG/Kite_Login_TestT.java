package sel_3_4_3_pom_kite_withDDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Login_TestT {
//public static void main(String[]args) throws Throwable {
	//Declare all Useful Members as Global
	FileInputStream fis ;
	 Sheet sh;
	 WebDriver D;
	 Kite_Login1ddf_PageT klp1;
	 Kite_Login2ddf_PageT klp2;
	 Kite_Home_ddf_PageT khp;
@BeforeClass
public void OpenBrowser() throws Throwable{
	
	FileInputStream fis = new FileInputStream("D:\\API\\abc.xlsx");

    sh = WorkbookFactory.create(fis).getSheet("Sheet1");
    
    System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//-----> To get Url
	D.get("https://kite.zerodha.com/");
//----->For maximize the browser
	D.manage().window().maximize();
//-----> give global wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//-----> All Objects Of POM Class	
	
	klp1=new Kite_Login1ddf_PageT(D);
	klp2=new Kite_Login2ddf_PageT(D);
	khp=new Kite_Home_ddf_PageT(D);
}
@BeforeMethod
public void LoginToApp() {
	String UserID = sh.getRow(0).getCell(0).getStringCellValue();
	klp1.enterUN(UserID);
	String PassWD = sh.getRow(0).getCell(1).getStringCellValue();
	klp1.enterPWD(PassWD);
	klp1.clickLGNBTN();
	String PINvalue=sh.getRow(0).getCell(2).getStringCellValue();
	klp2.enterPIN(PINvalue);
	klp2.clickCONBTN();
}

@Test
public void verifyuserID() {
	Reporter.log("running verify user id",true);
	String actID = khp.verifyuserID();
	String ExpID=sh.getRow(0).getCell(3).getStringCellValue();
//	String actID = khp.verifyuserID();
//	String ExpID = sh.getRow(0).getCell(3).getStringCellValue();
	Assert.assertEquals(ExpID, actID,"TC IS PASS");
	
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout the application",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the app",true);
}
}





	//khp.verifyuserID(ExpID);
	
//	public class KiteTestT {
//		//declare all useful members as global
//		Sheet sh;
//		WebDriver driver;
//		KiteLogin1pageT login1;
//		 KiteLogin2pageT login2;
//		 KiteHomepageT home;
//		
//	@BeforeClass
//	public void openBrowser() throws Throwable {
//		FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\may7.xlsx");
//		sh = WorkbookFactory.create(fis).getSheet("may7");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
//	    driver=new ChromeDriver();
//	    driver.get("https://kite.zerodha.com/");
//	    //maximize
//	    driver.manage().window().maximize();
//	    //implicitly wait
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	    
//	    //all objects of POM class
//	    login1=new KiteLogin1pageT(driver);
//	     login2=new KiteLogin2pageT (driver);
//	     home=new KiteHomepageT(driver);
//	}
//	@BeforeMethod
//	public void loginToApp() {
//		//enter un
//		 String username = sh.getRow(0).getCell(0).getStringCellValue();//DPG458
//		 login1.enterUN(username);
//		 //enter pwd
//		 String password = sh.getRow(0).getCell(1).getStringCellValue();
//		login1.enterPWD(password);
//		//clck on login btn
//		login1.clickLOGINBTN();
//		
//		//enter pin
//		String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
//		login2.enterPIN(pinvalue);
//		//click on continue btn
//		login2.clickcntBtn();
//	}
//	@Test
//	public void verifyuserID() {
//		Reporter.log("running verify user id",true);
//		String actID = home.verifyuserID();
//		 String expID = sh.getRow(0).getCell(0).getStringCellValue();
//		Assert.assertEquals(expID,actID,"both are different tc is failed");
//	}
//	@AfterMethod
//	public void logoutApp() {
//		Reporter.log("logout the application",true);
//	}
//	@AfterClass
//	public void closeBrowser() {
//		Reporter.log("close the app",true);
//	}

