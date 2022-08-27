package Sel_2_9_actions_class_mouse_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Actions Class = If we want to handle mouse related actions then we have to use Actions Class
//    --->  Handling the cursor in our webapplication is called as "mouse handling"
public class Actions_Class {
//	1) moveToElement(TargetElement) ---> It is used to move the cursor towards the target element[I want to click on login] 
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("https://www.youtube.com/");
	cd.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement music=cd.findElement(By.xpath("//yt-formatted-string[.='Music']"));
	
	Actions act=new Actions(cd);
	// Action 1 --> Move to  target element
	//act.moveToElement(music).perform();
	// Action 2 --> Move to element and right click on target element
	//act.moveToElement(music).contextClick().perform();
	// Action 3 --> Move to element and left click on target element
	//act.moveToElement(music).click().perform();
	// Action 4 --> Move to element and Double click on target element
	act.moveToElement(music).doubleClick().perform();
	
	
	
}
}
