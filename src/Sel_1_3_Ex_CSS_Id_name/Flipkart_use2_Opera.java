package Sel_1_3_Ex_CSS_Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Flipkart_use2_Opera {
public static void main(String[] args) throws Throwable {

	
	System.setProperty("webdriver.opera.driver", "D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	
	WebDriver opdriver=new OperaDriver();
	//open flipkart.com
	opdriver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	//maximize the window
	opdriver.manage().window().maximize();
	// pop up page open --> click on close pop up button
	opdriver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	// Use css selector choice the laptop prices
	opdriver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops under 60000");
	Thread.sleep(3000);
	//click on search button
	opdriver.findElement(By.className("L0Z3Pu")).click();
	Thread.sleep(3000);
	//Option---->opdriver.findElement(By.cssSelector("button[class='L0Z3Pu']")).click();
	//Click on login 
	opdriver.findElement(By.className("_1_3w1N")).click();
	//Option---> //opdriver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
	//Enter Mobile Number
	opdriver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9834753809");//
	Thread.sleep(3000);
	//Enter Password
	opdriver.findElement(By.cssSelector("input[type='password']")).sendKeys("Nils@1234");
	Thread.sleep(2000);
	//Click on login button
	opdriver.findElement(By.className("_1D1L_j")).click();
	Thread.sleep(3000);
	//Option--->//opdriver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	//opdriver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("laptops under 50000");
	//Thread.sleep(3000);
	//opdriver.findElement(By.className("L0Z3Pu")).click();
	//driver.findElement(By.cssSelector("div[class='_28p97w']")).click();
	
	
}
}
