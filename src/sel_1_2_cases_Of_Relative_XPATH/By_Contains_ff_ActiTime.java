package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Contains_ff_ActiTime {
//   for using attributes
//   ex ---> //tagname[contains(@AN,'AV')]
//   for using text	
//	ex ----> //tagname[contains(text(),'text')]	
	
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver ffd = new FirefoxDriver();
	
	 ffd.get("https://demo.actitime.com/login.do");
     ffd.manage().window().maximize();
     Thread.sleep(3000);
     
	ffd.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	Thread.sleep(3000);
	
	ffd.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	Thread.sleep(3000);
	
	ffd.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
	
	String expT="actiTIME - Login";
	String actT =ffd.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
}

}
