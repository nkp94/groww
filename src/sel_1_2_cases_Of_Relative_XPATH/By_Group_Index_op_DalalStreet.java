package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Group_Index_op_DalalStreet {
	//----> (xpath expression)[index]
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opd=new OperaDriver();
	
	opd.get("https://www.dsij.in/");
	Thread.sleep(3000);

	opd.manage().window().maximize();
	
	Thread.sleep(1000);
	
	opd.findElement(By.xpath("(//a)[6]")).click();

	Thread.sleep(1000);
	opd.findElement(By.xpath("(//input)[8]")).sendKeys("nkpatil415@gmail.com");

	Thread.sleep(1000);
	opd.findElement(By.xpath("(//input)[9]")).sendKeys("Nilesh@1234");	

	Thread.sleep(2000);
	opd.findElement(By.xpath("//a[contains(@id,'dnn_ctr5070_Login_Login_DNN_cmdLogin')]")).click();
	Thread.sleep(2000);

	opd.findElement(By.xpath("//a[contains(@id,'dnn_dnnUser_userNameLink')]")).click();

	Thread.sleep(4000);
	opd.findElement(By.xpath("(//strong)[1]")).click();

	Thread.sleep(4000);
	
	String expT="Share/Stock Market Tips, Indian Stock Market News, BSE/NSE, Trading Tips | Dalal Street Journal";
	String actT =opd.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	  
	    opd.close();
		Thread.sleep(2000);
	
	    opd.quit();

}
}
