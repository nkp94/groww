package sel_3_4_3_pom_neostox_withDDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sel_3_2_pom_neostox.Neo_Home_Page;
import sel_3_2_pom_neostox.Neo_Login1_Page;
import sel_3_2_pom_neostox.Neo_Login2_Page;
import sel_3_2_pom_neostox.Neo_Sign_In_Page;
import sel_3_3_pom_neostox_withDDF.Neo_Hme_Page;
import sel_3_3_pom_neostox_withDDF.Neo_Lgn1_Page;
import sel_3_3_pom_neostox_withDDF.Neo_Lgn2_Page;
import sel_3_3_pom_neostox_withDDF.Neo_Sgn_In_Page;

public class Neo_withDDF_TestNG {
//public static void main(String[]args) throws Throwable {
	Sheet ex;
	WebDriver D;
	Neo_Sgn_In_PageT SGN;
	Neo_Lgn1_PageT L1;
	Neo_Lgn2_PageT L2;
	Neo_Hme_PageT HP;
	@BeforeClass
public void openBrowser()throws Throwable{
		
	FileInputStream fis1=new FileInputStream("D:\\New folder\\neostox.xlsx");
	Sheet ex = WorkbookFactory.create(fis1).getSheet("Sheet1");
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//---> Enter Url	
	D.get("https:/neostox.com/");
	
//---> To Maximize Window	
	D.manage().window().maximize();
	
//---> Global Wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//---> All Objects Of POM Class	
    SGN=new Neo_Sgn_In_PageT(D);
    
    Thread.sleep(2000);
	L1=new Neo_Lgn1_PageT(D);
    L2=new Neo_Lgn2_PageT(D);
    HP=new Neo_Hme_PageT(D);
	}  
 @BeforeMethod
 
 public void SignIn() {
	 
	 SGN.pressSignIn();
	 String enterID = ex.getRow(0).getCell(0).getStringCellValue();
	 L1.enterID(enterID);
     String Password = ex.getRow(0).getCell(1).getStringCellValue();
     L2.enterPass(Password);
     L2.ClickSB2();
 }
 @Test
 public void verifyuserID() {
	 Reporter.log("Running VerifyUserID",true);
	 String ActT=HP.verifyuserID();
	 String ExpT = ex.getRow(0).getCell(2).getStringCellValue();
	 Assert.assertEquals(ActT, ExpT,"Both Are Different TC is Failed");
 }
 @AfterMethod
 public void logoutApp() {
	 Reporter.log("Logout The Application");
 }
 @AfterClass
 public void closeBrowser() {
	 Reporter.log("Close The App",true);
	
	 
    
 
 
 
 
 
//	SGN.pressSignIn();
//	
//
//
//	//String enterID = ex.getRow(0).getCell(0).getStringCellValue();
//	//L1.enterID(enterID);
//
//	L1.clickSB1();
//	WebDriverWait Wait =new WebDriverWait(D,Duration.ofSeconds(10));
//	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='lnk_submitmobnumber']")));
//	
//
//	
//	String Password = ex.getRow(0).getCell(1).getStringCellValue();
//	L2.enterPass(Password);
//	Thread.sleep(2000);
//	L2.ClickSB2();
//
//	Thread.sleep(2000);
//    
//    String ExpT = ex.getRow(0).getCell(2).getStringCellValue();
//    HP.verifyuserID();

	
}
	
	
}
