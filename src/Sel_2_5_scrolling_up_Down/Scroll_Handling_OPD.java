package Sel_2_5_scrolling_up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Scroll_Handling_OPD {
public static void main(String[] args) throws Throwable {
	
    System.setProperty("webdriver.opera.driver", "D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opd=new OperaDriver();
	
	// zomato.com
	opd.get("https://www.zomato.com/");
	Thread.sleep(2000);
	
	JavascriptExecutor jse=(JavascriptExecutor)opd;
	
	jse.executeScript("window.scrollBy(0,2000);");
    Thread.sleep(2000);
    jse.executeScript("window.scrollBy(0,-2000);");
}
}
