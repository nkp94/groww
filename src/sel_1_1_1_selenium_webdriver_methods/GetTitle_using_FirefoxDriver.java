package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle_using_FirefoxDriver {
public static void main(String[]args) {
  
	System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
	 
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	//gettitle()
	String expT="google";
	String actT =driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
}

}
