package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Url_using_FirefoxDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");

		WebDriver ffdriver = new FirefoxDriver();
		ffdriver.get("https://www.google.com/");
		// Get Current Url

		String link = ffdriver.getCurrentUrl();
		System.out.println(link);
	}
}
