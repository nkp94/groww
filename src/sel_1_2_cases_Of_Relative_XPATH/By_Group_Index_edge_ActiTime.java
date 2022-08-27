package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_Group_Index_edge_ActiTime {
//----> (xpath expression)[index]
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver eddriver=new EdgeDriver();
	
	 eddriver.get("https://demo.actitime.com/login.do");
     eddriver.manage().window().maximize();
     Thread.sleep(3000);
     
	eddriver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	Thread.sleep(3000);
//	
	eddriver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
	Thread.sleep(3000);
//	
	eddriver.findElement(By.xpath("(//div)[13]")).click();
	
	String expT="actiTIME - Login";
	String actT =eddriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
}

}
