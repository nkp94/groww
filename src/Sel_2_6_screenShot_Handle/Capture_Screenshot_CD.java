package Sel_2_6_screenShot_Handle;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Capture_Screenshot_CD {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("https://www.google.com/search?q=indian+flag&sxsrf=ALiCzsYKguJAbjpYBih3KkDcPGzk5MbJ0A%3A1659632966022&source=hp&ei=Rf3rYqCaPJKH-AawrbbACg&iflsig=AJiK0e8AAAAAYuwLVtNpnkBEj_Fg7e8gXcXBafGeEDSa&oq=indian&gs_lcp=Cgdnd3Mtd2l6EAMYADIICAAQsQMQgwEyEQguEIAEELEDEIMBEMcBENEDMhEILhCABBCxAxCDARDHARDRAzILCAAQgAQQsQMQgwEyFAguEIAEELEDEIMBEMcBENEDENQCMgUIABCABDIICAAQsQMQgwEyCwguEIAEELEDEIMBMgoILhCxAxCDARAKMggIABCABBCxAzoHCCMQJxCdAjoECCMQJzoQCAAQgAQQhwIQsQMQgwEQFDoMCCMQJxCdAhBGEPoBUABY-A1g5xxoAHAAeAGAAc4DiAGHD5IBCTAuMS4yLjIuMZgBAKABAQ&sclient=gws-wiz");
	cd.manage().window().maximize();
	Thread.sleep(2000);
	cd.findElement(By.xpath("//a[.='Images']")).click();
	
    WebElement gTitle = cd.findElement(By.xpath("(//img[@class='rg_i Q4LuWd'])[1]"));
    File src = gTitle.getScreenshotAs(OutputType.FILE);
	TakesScreenshot ts=(TakesScreenshot)cd;
	File sd=new File("C:\\Users\\Nilesh Patil\\Desktop\\Screenshot\\india.jpg");
	Files.copy(src, sd);
	

}
}
