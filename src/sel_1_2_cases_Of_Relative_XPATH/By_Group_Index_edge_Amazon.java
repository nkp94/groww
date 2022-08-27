package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//----> (xpath expression)[index]
public class By_Group_Index_edge_Amazon {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver edd=new EdgeDriver();
	
	//open amazon.com
	edd.get("https://www.amazon.com/");
	Thread.sleep(2000);
	//maximize the window
	edd.manage().window().maximize();
	Thread.sleep(2000);
	//search by clicking search box
	edd.findElement(By.xpath("(//input)[4]")).sendKeys("digital watch");
	Thread.sleep(2000);
	
	//clicking on search button
	edd.findElement(By.xpath("(//input)[5]")).click();
    Thread.sleep(3000);
//    //clicking on user home - sign in button
	edd.findElement(By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]")).click();
	Thread.sleep(2000);
//	//entering user name
	edd.findElement(By.xpath("(//input)[7]")).sendKeys("nkpatil415@gmail.com");
	Thread.sleep(2000);
//	//clicking on continue button
	edd.findElement(By.xpath("(//input)[10]")).click();
	Thread.sleep(2000);
//	//entering password
	edd.findElement(By.xpath("(//input)[9]")).sendKeys("Nilesh@1234");
	Thread.sleep(2000);
//	//clicking on sign in button
	edd.findElement(By.xpath("(//input)[11]")).click();
	Thread.sleep(4000);

//	driver.close();
	
	
}
}
