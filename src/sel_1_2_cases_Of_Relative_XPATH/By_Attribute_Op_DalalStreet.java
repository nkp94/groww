package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Attribute_Op_DalalStreet {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opdriver=new OperaDriver();
	
	opdriver.get("https://www.dsij.in/");
	Thread.sleep(3000);
	
	opdriver.manage().window().maximize();
	
	
	Thread.sleep(2000);
	opdriver.findElement(By.xpath("//a[@id='dnn_userLogin69109_loginLink']")).click();
	Thread.sleep(3000);

	opdriver.findElement(By.xpath("//input[@id='dnn_ctr5070_Login_Login_DNN_txtUsername']")).sendKeys("nkpatil415@gmail.com");
	Thread.sleep(2000);
	
	opdriver.findElement(By.xpath("//input[@id='dnn_ctr5070_Login_Login_DNN_txtPassword']")).sendKeys("Nilesh@1234");
	Thread.sleep(2000);
	
	opdriver.findElement(By.xpath("//a[@id='dnn_ctr5070_Login_Login_DNN_cmdLogin']")).click();
	Thread.sleep(2000);
	
	opdriver.findElement(By.xpath("//a[@id='dnn_dnnUser_userNameLink']")).click();
	Thread.sleep(4000);
	
	opdriver.findElement(By.xpath("//a[@id='dnn_userLogin69109_logoffLink']")).click();
	Thread.sleep(4000);
	
	String expT="Share/Stock Market Tips, Indian Stock Market News, BSE/NSE, Trading Tips | Dalal Street Journal";
	String actT =opdriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	  //  Thread.sleep(3000);
	    opdriver.close();
		Thread.sleep(2000);
	
	    opdriver.quit();
	
	
}
}
