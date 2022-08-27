package sel_1_1_1_selenium_webdriver_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetBrowserSize2_using_EdgeDriver {
public static void main(String[]args) {
	System.setProperty("webdriver.edge.driver","D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.cricbuzz.com/");
	
	//Dimension d=new Dimension(100,200);
	//driver.manage().window().setSize(d);
	
	//Set the position of browser
	Point p=new Point(0,0);
	
	driver.manage().window().setPosition(p);
}
}
