package Sel_2_8_findElements_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	cd.findElement(By.xpath("//button[text()='✕']")).click();
	// To get multiple elements from webpage
	List<WebElement> ele=cd.findElements(By.xpath("//div"));
	for(WebElement i:ele) {
		String str=i.getText();
		System.out.println(str);
	
  }
 }
}
