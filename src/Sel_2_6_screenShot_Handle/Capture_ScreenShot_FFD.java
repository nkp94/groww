package Sel_2_6_screenShot_Handle;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

// It is prototype without any functionality
public class Capture_ScreenShot_FFD {
// We have getScreenShotAs() which is present in takes-screenshot(I)
// We have to TypeCast screenshot	
	
	
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	//open flipkart.com
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	//maximize the window
	driver.manage().window().maximize();
	// Use get ScreenShot 
	TakesScreenshot ts =(TakesScreenshot)driver;
	//typecast screenshot
	File src =ts.getScreenshotAs(OutputType.FILE);
	// We have to store screenshot at particular destination
	File dst=new File("C:\\Users\\Nilesh Patil\\Desktop\\Screenshot\\AMAZON.jpg");
	// we have to transfer from source to destination
	Files.copy(src, dst);
	
}	
}
