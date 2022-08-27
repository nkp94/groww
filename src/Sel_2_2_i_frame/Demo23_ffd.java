package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo23_ffd {
public static void main(String[]args) throws Throwable {
	 
	// Firefox Driver
     System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
	 WebDriver ffd = new FirefoxDriver();
	 
	 ffd.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	 // Maximize window
	 
	 ffd.manage().window().maximize();
	 // 1st Frame
	 // Take 3rd element from 1st frame
	 ffd.switchTo().frame("packageListFrame");
	 String text1=ffd.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']")).getText();
	 System.out.println(text1);
	 Thread.sleep(3000);
	 
	 ffd.switchTo().defaultContent();
	// 2nd Frame --> 3rd element
	 ffd.switchTo().frame("packageFrame");
	 String text2=ffd.findElement(By.xpath("//a[text()='AbstractFindByBuilder']")).getText();
	 
	 System.out.println(text2);
	 Thread.sleep(2000);
	 
	 ffd.switchTo().defaultContent();
	// 3rd Frame --> 3rd element
	 ffd.switchTo().frame("classFrame");
	 String text3=ffd.findElement(By.xpath("//a[text()='Capabilities']")).getText();
	 System.out.println(text3);
	 
	 
	 
	 
	 
	 
}
}
