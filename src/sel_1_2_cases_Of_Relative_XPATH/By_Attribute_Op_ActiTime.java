package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Attribute_Op_ActiTime {
// It is applicable for all the attributes
	//ex ---> id="1234" ,name="nilesh",placeholder="google"
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
	
	String expT="actiTIME - Login";
	String actT =opdriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
}

}
