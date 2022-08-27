package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo12_ED {
public static void main(String[]args) throws Throwable {
	// Edge Driver
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver edd=new EdgeDriver();
	
	edd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	Thread.sleep(3000);
	
	
	edd.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	edd.findElement(By.xpath("//input[@id='fname']")).sendKeys("Akshay");
	Thread.sleep(1000);
	edd.findElement(By.xpath("//input[@id='lname']")).sendKeys("Kumar");
	Thread.sleep(1000);
	edd.findElement(By.xpath("//input[@value='Submit']")).click();
	
	
	String ExpT="Tryit Editor v3.7";
	String ActT =edd.getTitle();
	if(ActT.equals(ExpT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	
}
}
