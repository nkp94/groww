package Sel_2_3_pop_ups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser2 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	 WebDriver d=new ChromeDriver();
	 
	 d.get("https://www.flipkart.com/");
	 
	 d.findElement(By.xpath("//button[text()='✕']")).click();
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 Thread.sleep(2000);
	 d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	 Thread.sleep(1000);
	//  To switch window from Main window to child Window
	    
	    Set<String> allwindows = d.getWindowHandles();
	    // Using arraylist here to store all windows
	   ArrayList<String> al=new ArrayList<String>(allwindows);
	   String childWindow = al.get(1);
	   System.out.println(childWindow);
	   Thread.sleep(1000);
	   // To Print main window session id
	   String mainwindow = al.get(0);
	   System.out.println(mainwindow);
	   // To switch on main window
	   Thread.sleep(3000);
	   //d.navigate().back();
	  // d.switchTo().window(al.get(0));
	   //for Check getTitle
	   String title = d.getTitle();
	   System.out.println(title);
	 
	 
	 
}
}
