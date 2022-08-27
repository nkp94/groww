package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Attribute_Op {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opdriver=new OperaDriver();
	
	 opdriver.get("https://demo.actitime.com/login.do");
     opdriver.manage().window().maximize();
     Thread.sleep(3000);
     
	opdriver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Thread.sleep(3000);
	
	opdriver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(3000);
	
	opdriver.findElement(By.xpath("//div[text()='Login ']")).click();
}

}
