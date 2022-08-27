package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//It is applicable for all the attributes
//----------> //tagname[@AN='AV']
public class By_Group_Index_CD_Amazon2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open amazon.com
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	//maximize the window
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//search by clicking search box
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("digital watch");
	Thread.sleep(2000);
	
	//clicking on search button
	driver.findElement(By.xpath("(//input)[5]")).click();
    Thread.sleep(3000);
//    //clicking on userhome-sign in button
	driver.findElement(By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]")).click();
	Thread.sleep(2000);
//	//entering user name
	driver.findElement(By.xpath("(//input)[7]")).sendKeys("nkpatil415@gmail.com");
	Thread.sleep(2000);
//	//clicking on continue button
	driver.findElement(By.xpath("(//input)[10]")).click();
	Thread.sleep(2000);
//	//entering password
	driver.findElement(By.xpath("(//input)[9]")).sendKeys("Nilesh@1234");
	Thread.sleep(2000);
//	//clicking on sign in button
	driver.findElement(By.xpath("(//input)[11]")).click();
	Thread.sleep(4000);

//	driver.close();
	
	
}
}
