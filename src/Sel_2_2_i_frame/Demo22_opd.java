package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Demo22_opd {
public static void main(String[]args) throws Throwable {
	 
	// Opera Driver
   	 System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	 WebDriver opd=new OperaDriver();
	 
	 opd.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	 // Maximize window
	 
	 opd.manage().window().maximize();
	 // 1st Frame
	 
	 opd.switchTo().frame("packageListFrame");
	 // Take 2nd element from 1st frame
	 String text1=opd.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi']")).getText();
	 System.out.println(text1);
	 Thread.sleep(2000);
	 
	 opd.switchTo().defaultContent();
	// 2nd Frame
	 opd.switchTo().frame("packageFrame");
	 String text2=opd.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
	 System.out.println(text2);
	 Thread.sleep(2000);
	 
	 opd.switchTo().defaultContent();
	// 3rd Frame --> 2nd element
	 opd.switchTo().frame("classFrame");
	 String text3=opd.findElement(By.xpath("//a[text()='By.Remotable']")).getText();
	 System.out.println(text3);
	 
	 
	 
	 
	 
	 
}
}
