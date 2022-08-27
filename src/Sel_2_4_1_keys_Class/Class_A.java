package Sel_2_4_1_keys_Class;// Keys.TAB  & Keys.ENTER

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {
public static void main(String[] args) throws Throwable {
	// set the properties
	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// open the application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(3000);
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		Thread.sleep(3000);
//		driver.findElement(By.id("loginButton")).click();
	//	
		// Using Key Class
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
}
}
