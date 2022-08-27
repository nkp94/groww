package Sel_2_4_2_robot_Class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class_CD {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("https://www.amazon.com/");
	cd.manage().window().maximize();
	Thread.sleep(2000);
	
	//Import Robot Class
	
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	
	
	
	
}
}
