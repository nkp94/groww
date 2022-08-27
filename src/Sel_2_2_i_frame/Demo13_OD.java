package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Demo13_OD {
public static void main(String[]args) throws Throwable {
	// Opera Driver
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver od=new OperaDriver();
	
	od.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	Thread.sleep(3000);
	
	
	od.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	od.findElement(By.xpath("//input[@id='fname']")).sendKeys("Electrical");
	Thread.sleep(1000);
	od.findElement(By.xpath("//input[@id='lname']")).sendKeys("Engineer");
	Thread.sleep(1000);
	od.findElement(By.xpath("//input[@value='Submit']")).click();
	
	// Get Title
	String ExpT="Tryit Editor v3.7";
	String ActT =od.getTitle();
	if(ActT.equals(ExpT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	
}
}
