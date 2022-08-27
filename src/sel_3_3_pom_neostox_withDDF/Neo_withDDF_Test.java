package sel_3_3_pom_neostox_withDDF;

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

import sel_3_2_pom_neostox.Neo_Home_Page;
import sel_3_2_pom_neostox.Neo_Login1_Page;
import sel_3_2_pom_neostox.Neo_Login2_Page;
import sel_3_2_pom_neostox.Neo_Sign_In_Page;

public class Neo_withDDF_Test {
public static void main(String[]args) throws Throwable {
	
	FileInputStream fis1=new FileInputStream("D:\\neostox.xlsx");
	Sheet ex = WorkbookFactory.create(fis1).getSheet("Sheet1");
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//---> Enter Url	
	D.get("https:/neostox.com/");
	
//---> To Maximize Window	
	D.manage().window().maximize();
	
//---> Global Wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//---> Calling 1st POM Class	
	Neo_Sgn_In_Page SGN=new Neo_Sgn_In_Page(D);
	SGN.pressSignIn();
	
//---> Calling 2nd POM Class	
	Neo_Lgn1_Page L1=new Neo_Lgn1_Page(D);
	String enterID = ex.getRow(0).getCell(0).getStringCellValue();
	L1.enterID(enterID);
	Thread.sleep(2000);
	L1.clickSB1();
	
	WebDriverWait Wait =new WebDriverWait(D,Duration.ofSeconds(10));
	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='lnk_submitmobnumber']")));
	
//---> Calling 3rd POM Class
	Neo_Lgn2_Page L2=new Neo_Lgn2_Page(D);
	String Password = ex.getRow(0).getCell(1).getStringCellValue();
	L2.enterPass(Password);
	Thread.sleep(2000);
	L2.ClickSB2();
//---> Calling 4th POM Class	
	Thread.sleep(2000);
    Neo_Hme_Page HP=new Neo_Hme_Page(D);
    String ExpT = ex.getRow(0).getCell(2).getStringCellValue();
    HP.getText(ExpT);

	
}
	
	
}
