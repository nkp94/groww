package Sel_2_6_screenShot_Handle;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

// It is prototype without any functionality
public class Capture_ScreenShot_RandomString {
// We have getScreenShotAs() which is present in takes-screenshot(I)
// We have to TypeCast screenshot	
	
	
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	//open flipkart.com
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	//maximize the window
	driver.manage().window().maximize();
	// Use get ScreenShot 
	String random=RandomString.make();
	//typecast screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	// We have to store screenshot at particular destination
	File dest=new File("C:\\Users\\Nilesh Patil\\Desktop\\Screenshot\\"+random+" .jpg");
	// we have to transfer from source to destination
	Files.copy(src, dest);
	
}	
}
