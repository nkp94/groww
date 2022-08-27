package Sel_2_1_DD_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_HRM {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	Thread.sleep(2000);
	d.findElement(By.xpath("//div[.=' Login ']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//span[.='Admin']")).click();
	Thread.sleep(2000);
	//d.findElement(By.xpath("//select[@id='searchSystemUser_userType']")).click();
	
	WebElement dd=d.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]"));
	Select s=new Select(dd);
	s.selectByIndex(0);
//	s.selectByVisibleText("All");
//	s.selectByValue("")
}
}
