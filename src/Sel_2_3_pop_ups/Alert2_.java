package Sel_2_3_pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2_ {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	WebDriver d=new ChromeDriver();
	
	d.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	
	d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("54321");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(2000);
	
	// Switch From Main WebPage To popup
	Alert alt =d.switchTo().alert();
	Thread.sleep(2000);
	// Click on ok button
	alt.accept();
	//alt.dismiss();
	Thread.sleep(2000);
	String txt=alt.getText();
	System.out.println(txt);
	
	
	
	
}
}
