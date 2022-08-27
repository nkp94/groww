package sel_3_2_pom_neostox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neo_Test {
public static void main(String[]args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver D=new ChromeDriver();

//---> Enter Url	
	D.get("https:/neostox.com/");
	
//---> To Maximize Window	
	D.manage().window().maximize();
	
//---> Global Wait
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//---> Calling 1st POM Class	
	Neo_Sign_In_Page SGN=new Neo_Sign_In_Page(D);
	SGN.pressSignIn();
	
//---> Calling 2nd POM Class	
	Neo_Login1_Page L1=new Neo_Login1_Page(D);
	L1.enterID();
	Thread.sleep(2000);
	L1.clickSB1();
//---> Calling 3rd POM Class
	Neo_Login2_Page L2=new Neo_Login2_Page(D);
	L2.enterID();
	Thread.sleep(2000);
	L2.ClickSB2();
//---> Calling 4th POM Class	
	Thread.sleep(2000);
    Neo_Home_Page HP=new Neo_Home_Page(D);
    HP.getText();

	
}
}
