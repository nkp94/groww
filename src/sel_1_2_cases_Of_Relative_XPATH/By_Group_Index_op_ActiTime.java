package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Group_Index_op_ActiTime {
//----> (xpath expression)[index]
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opd=new OperaDriver();
	
	 opd.get("https://demo.actitime.com/login.do");
     opd.manage().window().maximize();
     Thread.sleep(3000);
     
	opd.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	Thread.sleep(3000);
//	
	opd.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	Thread.sleep(3000);
//	
	opd.findElement(By.xpath("(//div)[13]")).click();
	
	String expT="actiTIME - Login";
	String actT =opd.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
}

}
