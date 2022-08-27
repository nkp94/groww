package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_Contains_ff_neostox {
//  for using attributes
//  ex ---> //tagname[contains(@AN,'AV')]
//  for using text	
//	ex ----> //tagname[contains(text(),'text')]		
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver ffd = new FirefoxDriver();
	
	ffd.get("https:/neostox.com/");
	Thread.sleep(3000);
	
	ffd.findElement(By.xpath("//li[contains(@id,'lnk_toplinks_signin')]")).click();
//	cddriver.findElement(By.xpath("//li [contains(@id,'lnk_toplinks_signin')]")).click();
	Thread.sleep(2000);
//	
	ffd.findElement(By.xpath("//input [contains(@id,'txt_mobilenumber')]")).sendKeys("7773907045");
	Thread.sleep(2000);
//	
	ffd.findElement(By.xpath("//a [contains(@id,'lnk_submitmobnumber')]")).click();
	Thread.sleep(2000);
//	
	ffd.findElement(By.xpath("//input[contains(@id,'txt_accesspin')]")).sendKeys("2854");
	Thread.sleep(2000);
//	
	ffd.findElement(By.xpath("//a[contains(@id,'lnk_submitaccesspin')]")).click();
	Thread.sleep(2000);
//	
	ffd.findElement(By.xpath("//a[contains(@id,'navbarDropdown')]")).click();
	Thread.sleep(3000);
	
	ffd.findElement(By.xpath("//a[contains(@id,'ctl00_lnk_logout')]")).click();
//  
	Thread.sleep(5000);
	String expT="Neostox Virtual Stock Simulator | Trading Simulator | Option Simulator";
	String actT =ffd.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
}
}
