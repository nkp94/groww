package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo25_ED {
public static void main(String[]args) throws Throwable {
	// Edge Driver
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver ed=new EdgeDriver();
	 
	 ed.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	 // Maximize window
	 
	 ed.manage().window().maximize();
	 // 1st Frame
	 // Take 5th element from 1st frame
	 ed.switchTo().frame("packageListFrame");
	 String text1=ed.findElement(By.xpath("//a[text()='org.openqa.selenium.chromium']")).getText();
	 System.out.println(text1);
	 Thread.sleep(3000);
	 
	 ed.switchTo().defaultContent();
	// 2nd Frame --> 5th element
	 ed.switchTo().frame("packageFrame");
	 String text2=ed.findElement(By.xpath("//a[text()='AbstractHttpCommandCodec.CommandSpec']")).getText();
	 System.out.println(text2);
	 Thread.sleep(2000);
	 
	 ed.switchTo().defaultContent();
	// 3rd Frame --> 5th element
	 ed.switchTo().frame("classFrame");
	 String text3=ed.findElement(By.xpath("//a[text()='Credentials']")).getText();
	 System.out.println(text3);
	 
	 
	 
	 
	 
	 
}
}
