package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Get_Url2_using_OperaDriver {

public static void main(String[]args) {
	
	System.setProperty("webdriver.opera.driver", "D:\\\\Automation Testing\\\\Opera Driver\\\\operadriver_win64\\\\operadriver.exe");
	
	WebDriver opdriver=new OperaDriver();
	
	opdriver.get("https://www.google.com/");
	// Get Current Url
	
	String link=opdriver.getCurrentUrl();
	System.out.println(link);
}
}
