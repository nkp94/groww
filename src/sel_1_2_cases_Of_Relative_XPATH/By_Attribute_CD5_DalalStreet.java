package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Attribute_CD5_DalalStreet {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cddriver=new ChromeDriver();
	
	cddriver.get("https://www.dsij.in/");
	//Thread.sleep(20000);
	Thread.sleep(3000);
	//Thread.sleep(5000);
	cddriver.manage().window().maximize();
	
	//cddriver.findElement(By.xpath("//div[@class='mf-modal-close']")).click();
	//cddriver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	Thread.sleep(2000);
	cddriver.findElement(By.xpath("//a[@id='dnn_userLogin69109_loginLink']")).click();
	Thread.sleep(3000);

	cddriver.findElement(By.xpath("//input[@id='dnn_ctr5070_Login_Login_DNN_txtUsername']")).sendKeys("nkpatil415@gmail.com");
	Thread.sleep(2000);
	
	cddriver.findElement(By.xpath("//input[@id='dnn_ctr5070_Login_Login_DNN_txtPassword']")).sendKeys("Nilesh@1234");
	Thread.sleep(2000);
	
	cddriver.findElement(By.xpath("//a[@id='dnn_ctr5070_Login_Login_DNN_cmdLogin']")).click();
	Thread.sleep(2000);
	
	cddriver.findElement(By.xpath("//a[@id='dnn_dnnUser_userNameLink']")).click();
	Thread.sleep(4000);
	
	cddriver.findElement(By.xpath("//a[@id='dnn_userLogin69109_logoffLink']")).click();
	Thread.sleep(4000);
	
	//cddriver.close();
	//Thread.sleep(2000);
	
	
	String expT="Share/Stock Market Tips, Indian Stock Market News, BSE/NSE, Trading Tips | Dalal Street Journal";
	String actT =cddriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
	  
	    cddriver.close();
		Thread.sleep(2000);
	
	    cddriver.quit();
}
}
