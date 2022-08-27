package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_Attribute_edge {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver eddriver=new EdgeDriver();
	
	 eddriver.get("https://demo.actitime.com/login.do");
     eddriver.manage().window().maximize();
     Thread.sleep(3000);
     
	eddriver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Thread.sleep(3000);
	
	eddriver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(3000);
	
	eddriver.findElement(By.xpath("//div[text()='Login ']")).click();
}

}
