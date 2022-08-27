package Sel_2_2_i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo21_Edd {
public static void main(String[]args) throws Throwable {
	// Edge Driver
	 System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
     WebDriver edd=new EdgeDriver();
	 edd.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	 edd.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 edd.switchTo().frame("packageListFrame");
	// Take 4th element on 1st frame
	  String text1 = edd.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
	 System.out.println(text1);
	 Thread.sleep(3000);
	 
	 //Take 1st Element of 2nd frame
	 edd.switchTo().defaultContent();
	// Thread.sleep(1000);
	 edd.switchTo().frame("packageFrame");
	 String text2 = edd.findElement(By.xpath("//span[text()='Action']")).getText();
	 System.out.println(text2);
	 Thread.sleep(3000);
	 
	 //Take 5th Element of 3rd frame
	 edd.switchTo().defaultContent();
	 edd.switchTo().frame("classFrame");
	 String text3 = edd.findElement(By.xpath("//a[text()='Credentials']")).getText();
	 System.out.println(text3);
	 
	// Get Title
		String ExpT="org.openqa.selenium";
		String ActT =edd.getTitle();
		if(ActT.equals(ExpT)) {
			System.out.println("Test Case is Pass");
		}
		else {
			System.out.println(" Test case is fail,expT and actT are not matching");
		}
		

	 
	 
}
}
