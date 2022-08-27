package Sel_2_4_2_robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_Class_FFD {
// As we know that key class will not work at any place because of it's limitations
// To Avoid Key class limitations/Drawbacks robot class invented
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	//open flipkart.com
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	//maximize the window
	driver.manage().window().maximize();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	
}
}
