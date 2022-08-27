package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.opera.OperaDriver;

public class Navigate_using_opera {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.opera.driver", "D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver driver=new OperaDriver();
	
	

	//navigate()
	driver.navigate().to("https://www.cricbuzz.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	Thread.sleep(3000);
	driver.quit();
}
}
