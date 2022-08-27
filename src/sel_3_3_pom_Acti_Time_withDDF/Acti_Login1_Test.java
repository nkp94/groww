package sel_3_3_pom_Acti_Time_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sel_3_2_pom_Acti_Time.Acti_Home_Page;
import sel_3_2_pom_Acti_Time.Acti_Login_Page;

public class Acti_Login1_Test {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("D:\\def.xlsx");

		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();

		// ---> Enter Url
		D.get("https://demo.actitime.com/login.do");

		// ---> To Maximize Window
		D.manage().window().maximize();

		// ---> Global Wait
		D.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// ---> Calling 1st POM Class
		Acti_Login1_Page LGN1 = new Acti_Login1_Page(D);
		String Userid = sh.getRow(0).getCell(0).getStringCellValue();
		LGN1.enterUN(Userid);
		String Password = sh.getRow(0).getCell(1).getStringCellValue();
		LGN1.enterPWD(Password);
		LGN1.clickLogin();
		// ---> Calling 2nd POM Class
		Acti_Home_Page HM = new Acti_Home_Page(D);
		HM.verifyText();

		// }

	}
}
