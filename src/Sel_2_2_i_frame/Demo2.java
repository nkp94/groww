package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	// Maximize 
	driver.manage().window().maximize();
	// 1st frame
	Thread.sleep(1000);
	driver.switchTo().frame("packageListFrame");
	// Take any element from first frame
	String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
	System.out.println(text1);
	Thread.sleep(1000);
	
//	// Switch to second frame
//	driver.switchTo().defaultContent();
//	driver.switchTo().frame("packageFrame");
//	// Take 2nd element on 2nd frame
//	String text2=driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
//	Thread.sleep(1000);
//	
//	// Switch to 3rd frame
//	driver.switchTo().defaultContent();
//	driver.switchTo().frame("classFrame");
//	// Take any element on 3rd frame
//	String text3=driver.findElement(By.xpath("//a[text()='WebDriver.Options']")).getText();
	
	               
	
}
}
