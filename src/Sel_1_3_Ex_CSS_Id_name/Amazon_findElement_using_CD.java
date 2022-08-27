package Sel_1_3_Ex_CSS_Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_findElement_using_CD {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//open flipkart.com
	driver.get("https://www.amazon.com/");
	Thread.sleep(4000);
	//maximize the window
	driver.manage().window().maximize();
	// pop up page open --> click on close pop up button
	//driver.findElement(By.cssSelector("div[class='nav-fill']")).click();
	Thread.sleep(2000);
	// Use css selector choice the laptop prices
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("laptops under 60000");
	Thread.sleep(3000);
	//click on search button
	driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	Thread.sleep(3000);
	driver.close();
	
	
}
}
