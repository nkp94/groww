package Sel_2_5_scrolling_up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Handling_FFD {
//The process of moving page up or down is called scroll handling
// To handle we need one interface JavaScriptExecutor() 
// inside it one method is there executeScript() This method takes argument as (window.Scrolling)	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	//open flipkart.com
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	//maximize the window
	driver.manage().window().maximize();
	// TypeCast javaScriptExecutor
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-1000);");
	
	
}	
}
