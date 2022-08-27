package sel_1_1_1_selenium_webdriver_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SetBrowserSize2_using_OperaDriver {
public static void main(String[]args) {
	
	System.setProperty("webdriver.opera.driver", "D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver driver=new OperaDriver();
	
	driver.get("https://www.cricbuzz.com/");
	
	//Dimension d=new Dimension(100,200);
	//driver.manage().window().setSize(d);
	
	//Set the position of browser
	Point p=new Point(0,0);
	
	driver.manage().window().setPosition(p);
}
}
