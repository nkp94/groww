package Sel_1_3_Ex_CSS_Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_application_Using_Automation {
public static void main(String[]args) throws Throwable {
	
	// set the properties
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// open the application
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(3000);
//	driver.findElement(By.id("username")).sendKeys("admin");
//	Thread.sleep(3000);
//	driver.findElement(By.name("pwd")).sendKeys("manager");
//	Thread.sleep(3000);
//	driver.findElement(By.id("loginButton")).click();
//	
	
}

}
