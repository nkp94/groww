package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo27 {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	//d.manage().window().maximize();
	Thread.sleep(2000);
	
	d.switchTo().frame("packageListFrame");
	String t1=d.findElement(By.xpath("//a[.='org.openqa.selenium.devtools.idealized.log.model']")).getText();
	System.out.println(t1);
	Thread.sleep(2000);
	
	d.switchTo().defaultContent();
	d.switchTo().frame("packageFrame");
	String t2=d.findElement(By.xpath("//a[.='Browser']")).getText();
	System.out.println(t2);
	Thread.sleep(2000);
	
	d.switchTo().defaultContent();
	d.switchTo().frame("classFrame");
	String t3=d.findElement(By.xpath("//a[text()='TakesScreenshot']")).getText();
	System.out.println(t3);
	
	
}
}
