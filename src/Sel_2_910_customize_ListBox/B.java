package Sel_2_910_customize_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
	static WebDriver d;
	public static void loop(int n,Keys arrowDown) {
		Actions act=new Actions(d);
		for(int i=1;i<=n;i++) {
			act.sendKeys(arrowDown).build().perform();
			
		}
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();

	 cd.get("https://www.facebook.com/");
	 
	  //click on create new acoount btn
	  cd.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	  //create object of Actions class 
	  Actions act=new Actions(cd);
	  
	  WebElement day=cd.findElement(By.xpath("//select[@id='day']"));
	  act.click(day).build().perform();
	  Thread.sleep(1000);
//	  //move down
      B.loop(15,Keys.ARROW_DOWN);
	  
//	  WebElement month = cd.findElement(By.xpath("//select[@id='month']"));
////	 
////	  
//	  //click on month
//	  Thread.sleep(3000);
//	  act.click(month).perform();
////	  //move to upside
//	  Thread.sleep(3000);
//	 
////	
//	  WebElement year=cd.findElement(By.xpath("//select[@id='year']"));
//	  
//	  //click on year
//	  Thread.sleep(2000);
//	  act.click(year).perform();
	  
	
  
	//  Thread.sleep(2000);
	  //WebElement gen = cd.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	  //act.click(gen).perform();
//	  WebElement r = cd.findElement(By.xpath("")).click();
//	  Thread.sleep(3000);
	  
//	  act.sendKeys(Keys.ARROW_DOWN).perform();
//	  //select topmost element
//	  act.sendKeys(Keys.HOME).perform();
//	  //click on element
//	  act.sendKeys(Keys.ENTER).perform();
	
}
}
