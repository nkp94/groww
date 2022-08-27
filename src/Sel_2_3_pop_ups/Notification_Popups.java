package Sel_2_3_pop_ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popups {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	//WebDriver cdd=new ChromeDriver();
	 //Create Object Of Browser Setting Class
	ChromeOptions opt= new ChromeOptions();
	// Call Add Argument method of browser setting class
	opt.addArguments("--disable-notifications");
	//pass ref variable in chromedriver constructor
	WebDriver d=new ChromeDriver(opt);
	d.get("https://www.hdfc.com");
	
	
	
}
}
