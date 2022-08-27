package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Attribute {
public static void main(String[]args) throws Throwable {
	
	         System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	        // open the application
	        driver.get("https://demo.actitime.com/login.do");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        //Enter Username
	       // driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	      
//	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		    //Thread.sleep(3000);
//		    
		    //driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//		    //Enter PWD
//		    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//		    Thread.sleep(3000);
		    //driver.findElement(By.xpath("//div[text()='Login ']")).click();
//		    
//		    //click on login button(xpath bt text())
//		    driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
