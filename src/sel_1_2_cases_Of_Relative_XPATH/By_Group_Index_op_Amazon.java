package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
//----> (xpath expression)[index]
public class By_Group_Index_op_Amazon {
public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opd=new OperaDriver();
	//open amazon.com
	opd.get("https://www.amazon.com/");
	Thread.sleep(2000);
	//maximize the window
	opd.manage().window().maximize();
	Thread.sleep(2000);
	//search by clicking search box
	opd.findElement(By.xpath("(//input)[4]")).sendKeys("digital watch");
	Thread.sleep(2000);
	
	//clicking on search button
	opd.findElement(By.xpath("(//input)[5]")).click();
    Thread.sleep(3000);
//    //clicking on userhome-sign in button
	opd.findElement(By.xpath("//span[contains(@id,'nav-link-accountList-nav-line-1')]")).click();
	Thread.sleep(2000);
//	//entering user name
	opd.findElement(By.xpath("(//input)[7]")).sendKeys("nkpatil415@gmail.com");
	Thread.sleep(2000);
//	//clicking on continue button
	opd.findElement(By.xpath("(//input)[10]")).click();
	Thread.sleep(2000);
//	//entering password
	opd.findElement(By.xpath("(//input)[9]")).sendKeys("Nilesh@1234");
	Thread.sleep(2000);
//	//clicking on sign in button
	opd.findElement(By.xpath("(//input)[11]")).click();
	Thread.sleep(4000);

//	driver.close();
	
	
}
}
