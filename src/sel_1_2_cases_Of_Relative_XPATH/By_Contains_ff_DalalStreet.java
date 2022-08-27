package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//for using attributes
//ex ---> //tagname[contains(@AN,'AV')]
//for using text	
//ex ----> //tagname[contains(text(),'text')]	
public class By_Contains_ff_DalalStreet {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver ffd = new FirefoxDriver();
	
	ffd.get("https://www.dsij.in/");
	Thread.sleep(3000);

	ffd.manage().window().maximize();
	
	Thread.sleep(2000);

	ffd.findElement(By.xpath("//a[contains(@id,'dnn_userLogin69109_loginLink')]")).click();

	Thread.sleep(3000);
	ffd.findElement(By.xpath("//input[contains(@id,'dnn_ctr5070_Login_Login_DNN_txtUsername')]")).sendKeys("nkpatil415@gmail.com");

	Thread.sleep(2000);
	ffd.findElement(By.xpath("//input[contains(@id,'dnn_ctr5070_Login_Login_DNN_txtPassword')]")).sendKeys("Nilesh@1234");	

	Thread.sleep(2000);
	ffd.findElement(By.xpath("//a[contains(@id,'dnn_ctr5070_Login_Login_DNN_cmdLogin')]")).click();
	Thread.sleep(2000);

	ffd.findElement(By.xpath("//a[contains(@id,'dnn_dnnUser_userNameLink')]")).click();

	Thread.sleep(4000);
	ffd.findElement(By.xpath("//a[contains(@id,'dnn_userLogin69109_logoffLink')]")).click();
	Thread.sleep(4000);
	
	String expT="Share/Stock Market Tips, Indian Stock Market News, BSE/NSE, Trading Tips | Dalal Street Journal";
	String actT =ffd.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
//	
//	  //  Thread.sleep(3000);
//	    cddriver.close();
//		Thread.sleep(2000);
//	
//	    cddriver.quit();

}
}
