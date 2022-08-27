package Sel_1_3_Ex_CSS_Id_name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_use {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	// click on search button
	// Use css seletor choice the laptop
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("shakira songs");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("div[id='title-wrapper']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("yt-icon[class='style-scope ytd-button-renderer']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Akshay kumar songs");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[id='title-wrapper']")).click();
	Thread.sleep(5000);
	driver.close();
}
}
