package sel_1_1_1_selenium_webdriver_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetBrowserSize_using_FirefoxDriver {
public static void main(String[]args) {
	System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
	 
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.cricbuzz.com/");
	
	//Dimension d=new Dimension(100,200);
	//driver.manage().window().setSize(d);
	
	//Set the position of browser
	Point p=new Point(100,100);
	
	driver.manage().window().setPosition(p);
}
}
