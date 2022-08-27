package Sel_2_4_2_robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_Class_ED {
// As we know that key class will not work at any place because of it's limitations
// To Avoid Key class limitations/Drawbacks robot class invented
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver edd=new ChromeDriver();
	// Open Flipcart.com
	edd.get("https://www.amazon.com/");
	Thread.sleep(2000);
	edd.manage().window().maximize();
	// Robot Class
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	
		
}
}
