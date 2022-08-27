package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Attribute_CD4_neostox {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cddriver=new ChromeDriver();
	
	cddriver.get("https:/neostox.com/");
	Thread.sleep(3000);
	
	cddriver.findElement(By.xpath("//a[text()='Sign In']")).click();
	Thread.sleep(2000);
	cddriver.findElement(By.xpath("//input[@id='txt_mobilenumber']")).sendKeys("7773907045");
	Thread.sleep(3000);
	
	cddriver.findElement(By.xpath("//a[@id='lnk_submitmobnumber']")).click();
	Thread.sleep(2000);
	
	cddriver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys("2854");
	Thread.sleep(2000);
	
	cddriver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
	Thread.sleep(3000);
	
	cddriver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
	Thread.sleep(4000);
	
	cddriver.findElement(By.xpath("//a[@id='ctl00_lnk_logout']")).click();
	Thread.sleep(2000);
	
	String expT="Neostox Virtual Stock Simulator | Trading Simulator | Option Simulator";
	String actT =cddriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	
	
}
}
