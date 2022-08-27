package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Attribute_CD2_ActiTime {
// It is applicable for all the attributes
	//ex ---> id="1234" ,name="nilesh",placeholder="google"
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	 driver.get("https://demo.actitime.com/login.do");
     driver.manage().window().maximize();
     Thread.sleep(3000);
     
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(3000);
	////input[@id='username']
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	String expT="actiTIME - Login";
	String actT =driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
}

}
