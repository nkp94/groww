package Sel_2_4_2_robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Robot_Class_OPD {
// As we know that key class will not work at any place because of it's limitations
// To Avoid Key class limitations/Drawbacks robot class invented
public static void main(String[] args) throws Throwable {
	
    System.setProperty("webdriver.opera.driver", "D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	
	WebDriver opd=new OperaDriver();
	// Open amazon.com
	opd.get("https://www.amazon.com/");
	Thread.sleep(2000);
	opd.manage().window().maximize();
	// Robot Class
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	

}
}
