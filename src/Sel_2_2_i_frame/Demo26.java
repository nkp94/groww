package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo26 {
public static void main(String[]args) throws Throwable {
	// Chrome Driver
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	
	WebDriver cd=new ChromeDriver();
	
	//get url
	cd.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	cd.manage().window().maximize();
	//Use Method --> switchTo.frame
	// 1st frame
	cd.switchTo().frame("packageListFrame");
	String text1 = cd.findElement(By.xpath("//a[text()='org.openqa.selenium.devtools']")).getText();
	System.out.println(text1);
	Thread.sleep(2000);
	// Use switchTo.defaultContent() ---> Move control from 1st frame to Main WebPage
	cd.switchTo().defaultContent();
	// 2nd frame
	cd.switchTo().frame("packageFrame");
	String text2=cd.findElement(By.xpath("//a [text()='ActualMain']")).getText();
	System.out.println(text2);
	Thread.sleep(2000);
	// Use switchTo.defaultContent() ---> Move control from 2nd frame to Main WebPage
	cd.switchTo().defaultContent();
	// 3rd frame
	cd.switchTo().frame("classFrame");
	String text3=cd.findElement(By.xpath("//a[text()='TakesScreenshot']")).getText();
	System.out.println(text3);
	cd.switchTo().parentFrame();
	
	
}

}
