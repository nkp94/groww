package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Demo14_FF {
public static void main(String[]args) throws Throwable {
	// Firefox Driver
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver ffd = new FirefoxDriver();
	
	ffd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	Thread.sleep(2000);
	
	
	ffd.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	ffd.findElement(By.xpath("//input[@id='fname']")).sendKeys("Rohit");
	Thread.sleep(1000);
	ffd.findElement(By.xpath("//input[@id='lname']")).sendKeys("Sharma");
	Thread.sleep(1000);
	ffd.findElement(By.xpath("//input[@value='Submit']")).click();
	
	// Get Title
	String ExpT="Tryit Editor v3.7";
	String ActT =ffd.getTitle();
	if(ActT.equals(ExpT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	
}
}
