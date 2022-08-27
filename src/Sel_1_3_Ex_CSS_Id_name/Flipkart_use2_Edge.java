package Sel_1_3_Ex_CSS_Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_use2_Edge {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	//open flipkart.com
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	//maximize the window
	driver.manage().window().maximize();
	// pop up page open --> click on close pop up button
	//driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	//Thread.sleep(2000);
	// Use css selector choice the laptop prices
	//driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops under 60000");
	//Thread.sleep(3000);
	//click on search button
	//driver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
	//driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9834753809");//
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Nils@1234");
	//Thread.sleep(2000);
	//driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	//driver.findElement(By.cssSelector("div[class='_28p97w']")).click();
	
	
}
}
