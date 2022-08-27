package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Url2_using_EdgeDriver {

public static void main(String[]args) throws Throwable {
	System.setProperty("webdriver.edge.driver","D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver egedriver=new EdgeDriver();
	// get Url
	egedriver.get("https://www.google.com/");
	// Get Current Url
	
	
	String curl = egedriver.getCurrentUrl();
	System.out.println(curl);
    
	String expt="Google";
	String gt = egedriver.getTitle();
	Thread.sleep(2000);
	if(gt.equals(expt)) {
		System.out.println("TC Is PASS");
	}
	else {
		
	System.out.println("TC Is FAIL");
	}
}
}
