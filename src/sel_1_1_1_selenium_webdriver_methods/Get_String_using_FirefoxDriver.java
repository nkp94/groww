package sel_1_1_1_selenium_webdriver_methods;
// Advantages of Selenium
// [1] Open source and free tool
// [2] It will supports multilannguages
// [3] Cross browser / compatability Testing is possible
// [4] Multibrowser testing is possible
// [5] it is Flexible

// Disadvantages of selenium
// [1] We can automate only web based applications
// [2] We can't automate captcha
// [3] We can't automate desktop based applications
// [4] Adhoc test cases can't be automated
// [5] We can't read barcode

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_String_using_FirefoxDriver {
public static void main(String[]args) throws Throwable  {
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");

	WebDriver ffdriver = new FirefoxDriver();
	//open the url
	//driver.get("https://www.yahoo.com");
	//Thread.sleep(3000);
    ffdriver.get("https://www.cricbuzz.com");
	ffdriver.manage().window().maximize();
	Thread.sleep(3000);
	ffdriver.manage().window().minimize();
	Thread.sleep(3000);
	ffdriver.close();
	
}

}
