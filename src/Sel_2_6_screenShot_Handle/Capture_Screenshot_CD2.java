package Sel_2_6_screenShot_Handle;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Capture_Screenshot_CD2 {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("https://www.youtube.com/");
	cd.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot ts=(TakesScreenshot)cd;
	File ss =ts.getScreenshotAs(OutputType.FILE);
	File sd=new File("C:\\Users\\Nilesh Patil\\Desktop\\Screenshot\\youtube.jpg");
	Files.copy(ss, sd);
	

}
}
