package sel_3_4_2_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_Testing {
	@Parameters("BrowserName")//----> Annotation
	@Test
	public void TC(String BrowserName) {
		WebDriver driver=null; //----> Runtime Polymorphism
		
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		
		
}
}