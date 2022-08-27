package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate2_using_FirefoxDriver {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");

	
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.cricbuzz.com/");
	Thread.sleep(3000);
	//navigate()
	driver.navigate().to("https://www.cricbuzz.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(3000);
	driver.close();
	
	}
}
