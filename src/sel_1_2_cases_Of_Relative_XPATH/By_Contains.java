package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Contains {
//  for using attributes
//  ex ---> //tagname[contains(@AN,'AV')]
//  for using text	
//	ex ----> //tagname[contains(text(),'text')]		
	
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\\\Automation Testing\\\\chrome driver\\\\chromedriver.exe");
	WebDriver cddriver=new ChromeDriver();
	
	cddriver.get("https://demo.actitime.com/login.do");
    cddriver.manage().window().maximize();
    Thread.sleep(3000);
	
    
    cddriver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
    Thread.sleep(2000);
    
    cddriver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
    Thread.sleep(2000);
    
    cddriver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
    
    String expT="actiTIME - Login";
	String actT =cddriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
    
}
}
