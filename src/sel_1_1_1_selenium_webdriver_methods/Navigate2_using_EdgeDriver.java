package sel_1_1_1_selenium_webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate2_using_EdgeDriver {
public static void main(String[]args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	//navigate()
	driver.navigate().to("https://www.cricbuzz.com/");
	Thread.sleep(3000);
	
	String expt="IPL 2022 Live Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com";
	String gt=driver.getTitle();
	//System.out.println(gt);
	if(gt.equals(expt)) {
		System.out.println(" TC Is Pass as expt is :" + gt );
	}else {
		System.out.println(" TC Is FAIL ");
	}
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	String expt1="Google";
	String gt1=driver.getTitle();
//	System.out.println(gt1);
	Thread.sleep(2000);
	if(gt1.equals(expt1)) {
		System.out.println(" TC Is Pass as expt is :" + gt1);
	}else {
		System.out.println(" TC Is FAIL ");
	}
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(3000);
	//driver.close();
}
}
