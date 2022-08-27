package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Url_using_ChromeDriver {

public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver crodriver=new ChromeDriver();
	crodriver.get("https://www.google.com/");
	// Get Current Url
	
	String link=crodriver.getCurrentUrl();
	System.out.println(link);
}
}
