package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Group_Index_op_neostox {
	//----> (xpath expression)[index]	
	
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opd=new OperaDriver();
	
	opd.get("https:/neostox.com/");
	Thread.sleep(3000);
	
	opd.findElement(By.xpath("(//li)[7]")).click();
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//input)[8]")).sendKeys("7773907045");
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//a)[10]")).click();
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//input)[8]")).sendKeys("2854");
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//a)[10]")).click();
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//ul)[6]")).click();
	Thread.sleep(3000);
	
	opd.findElement(By.xpath("//a[contains(@id,'ctl00_lnk_logout')]")).click();
  
	Thread.sleep(5000);
	String expT="Neostox Virtual Stock Simulator | Trading Simulator | Option Simulator";
	String actT =opd.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
}
}
