package Sel_2_5_scrolling_up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Handling_ED {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver edd=new EdgeDriver();
	
	edd.get("https://www.youtube.com/");
	Thread.sleep(2000);
	
	JavascriptExecutor jse=(JavascriptExecutor)edd;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(2000);
	
	jse.executeScript("window.scrollBy(0,-2000);");
	
	//window.scrollBy(0,2000);
	
}
}
