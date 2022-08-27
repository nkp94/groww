package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[]args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	Thread.sleep(3000);
	
	
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Nilesh");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Patil");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	
	
	
}
}
