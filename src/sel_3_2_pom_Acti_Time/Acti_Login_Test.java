package sel_3_2_pom_Acti_Time;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_Login_Test {
public static void main(String[]args) {

	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//---> Enter Url	
	D.get("https://demo.actitime.com/login.do");
	
//---> To Maximize Window	
	D.manage().window().maximize();
	
//---> Global Wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
//---> Calling 1st POM Class	
    Acti_Login_Page LGN=new Acti_Login_Page(D);
    LGN.enterUN();
    LGN.enterPWD();
    LGN.clickLogin();
   
//---> Calling 2nd POM Class
    Acti_Home_Page HM=new Acti_Home_Page(D);
	HM.verifyText();
	
}
}
