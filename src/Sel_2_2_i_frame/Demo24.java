package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo24 {
public static void main(String[]args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	 WebDriver d=new ChromeDriver();
	 
	 d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	 // Maximize window
	 
	 d.manage().window().maximize();
	 // 1st Frame
	 // Take 4th element from 1st frame
	 d.switchTo().frame("packageListFrame");
	 String text1=d.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
	 System.out.println(text1);
	 Thread.sleep(3000);
	 
	 d.switchTo().defaultContent();
	// 2nd Frame --> 4th element
	 d.switchTo().frame("packageFrame");
	 String text2=d.findElement(By.xpath("//a[text()='AbstractHttpCommandCodec']")).getText();
	 
	 System.out.println(text2);
	 Thread.sleep(2000);
	 
	 d.switchTo().defaultContent();
	// 3rd Frame --> 4th element
	 d.switchTo().frame("classFrame");
	 String text3=d.findElement(By.xpath("//a[text()='ContextAware']")).getText();
	 System.out.println(text3);
	 
	 
	 
	 
	 
	 
}
}
