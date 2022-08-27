package Sel_2_910_customize_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();

	 cd.get("https://www.facebook.com/");
	 
	  //click on create new acoount btn
	  cd.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  //select list box of month
	
	  //
	  Thread.sleep(3000);
	  cd.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Nilesh");
	  Thread.sleep(1000);
	  cd.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Patil");
	  Thread.sleep(1000);
	  cd.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9834753809");
	  Thread.sleep(1000);
	  cd.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("9834753809");
	  Thread.sleep(2000);
	  
	  //create object of Actions class 
	  Actions act=new Actions(cd);
	  
	  WebElement day=cd.findElement(By.xpath("//select[@id='day']"));
	  act.click(day).perform();
	  Thread.sleep(1000);
	  //move down
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
//	  
	  WebElement month = cd.findElement(By.xpath("//select[@id='month']"));
//	 
//	  
	  //click on month
	  Thread.sleep(3000);
	  act.click(month).perform();
//	  //move to upside
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ARROW_UP).perform();
	  act.sendKeys(Keys.ARROW_UP).perform();
//	
	  WebElement year=cd.findElement(By.xpath("//select[@id='year']"));
	  
	  //click on year
	  Thread.sleep(2000);
	  act.click(year).perform();
	  
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
  
	  Thread.sleep(2000);
	  WebElement gen = cd.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	  act.click(gen).perform();
	  Thread.sleep(2000);
	  cd.findElement(By.xpath("(//button[.='Sign Up'])[1]")).click();
	  
//	  WebElement r = cd.findElement(By.xpath("")).click();
//	  Thread.sleep(3000);
	  
//	  act.sendKeys(Keys.ARROW_DOWN).perform();
//	  //select topmost element
//	  act.sendKeys(Keys.HOME).perform();
//	  //click on element
//	  act.sendKeys(Keys.ENTER).perform();
	
}
}
