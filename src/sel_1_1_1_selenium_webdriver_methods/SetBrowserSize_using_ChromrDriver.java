package sel_1_1_1_selenium_webdriver_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize_using_ChromrDriver {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	
	//Dimension d=new Dimension(100,200);
	//driver.manage().window().setSize(d);
	
	//Set the position of browser
	Point p=new Point(0,0);
	
	driver.manage().window().setPosition(p);
}
}
