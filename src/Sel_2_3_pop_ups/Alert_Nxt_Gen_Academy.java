package Sel_2_3_pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Nxt_Gen_Academy {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	WebDriver cd=new ChromeDriver();
	
	cd.get(" https://nxtgenaiacademy.com/alertandpopup/");
	Thread.sleep(2000);
	
	//cd.findElement(By.xpath("//button[.='Alert Box']")).click();
	//Thread.sleep(2000);
	//Alert alt=cd.switchTo().alert();
	//alt.accept();
	
//	cd.findElement(By.xpath("//button[.='Confirm Alert Box']")).click();
//	Thread.sleep(2000);
//	Alert alt=cd.switchTo().alert();
//	alt.accept();
	cd.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
	Thread.sleep(2000);
	Alert al=cd.switchTo().alert();
	al.accept();
	
	Thread.sleep(3000);
	String t=cd.getTitle();
	System.out.println(t);
	
	
}
}
