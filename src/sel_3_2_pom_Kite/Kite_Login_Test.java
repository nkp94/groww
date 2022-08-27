package sel_3_2_pom_Kite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_Test {
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//---> Enter Url	
	D.get("https://kite.zerodha.com/");
	
//---> To Maximize Window	
	D.manage().window().maximize();
	
//---> Global Wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
//---> Calling 1st POM Class	
	Kite_Login1_Page L1=new Kite_Login1_Page(D);
	L1.enterUN();
	L1.enterPWD();
	L1.clickLGNBTN();
	
//---> Calling 2nd POM Class
	Kite_Login2_Page L2=new Kite_Login2_Page(D);
	L2.enterPIN();
	L2.clickCONBTN();

//---> Calling 3rd POM Class
	Kite_Home_Page HP=new Kite_Home_Page(D);
	HP.verifyuserID();
	
	
	
}
}
