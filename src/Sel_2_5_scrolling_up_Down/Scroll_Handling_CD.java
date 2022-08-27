package Sel_2_5_scrolling_up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Handling_CD {

public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	//open flipkart.com
	cd.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	//maximize the window
    cd.manage().window().maximize();
	
 // pop up page open --> click on close pop up button
 	cd.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
 	Thread.sleep(2000);
    
    // TypeCast JavascriptExecutor
	JavascriptExecutor jse=(JavascriptExecutor)cd;
	jse.executeScript("window.scrollBy(0,2000);");
	Thread.sleep(2000);
	
	jse.executeScript("window.scrollBy(0,-2000);");
	
	
}	
}
