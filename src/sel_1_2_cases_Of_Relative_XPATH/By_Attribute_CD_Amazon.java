package sel_1_2_cases_Of_Relative_XPATH;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//It is applicable for all the attributes
//----------> //tagname[@AN='AV']
public class By_Attribute_CD_Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open Amazon.com
	driver.get("https://www.amazon.com/");
	
	//-----> give global wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//maximize the window
	driver.manage().window().maximize();
	
	//search by clicking search box

	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("digital hand watch");
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
	

//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("digital watch");
//	Thread.sleep(1000);
//	//clicking on search button
//	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//    Thread.sleep(2000);
//    //clicking on userhome-sign in button
//	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//	Thread.sleep(1000);
//	//entering user name
//	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("nkpatil415@gmail.com");
//	Thread.sleep(1000);
//	//clicking on continue button
//	driver.findElement(By.xpath("//input[@id='continue']")).click();
//	Thread.sleep(1000);
//	//entering password
//	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Nilesh@123");
//	Thread.sleep(1000);
//	//clicking on sign in button
//	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//	Thread.sleep(2000);

//	driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();
//	driver.close();
	
	
}
}
