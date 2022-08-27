package sel_3_4_2_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B {
	@Test
public void TC2() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
	}

}
