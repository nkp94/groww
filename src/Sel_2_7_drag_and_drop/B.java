package Sel_2_7_drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("https://demo.guru99.com/test/drag_drop.html");

	cd.manage().window().maximize();
	Thread.sleep(2000);
	// Inspect 1st element and store in ele1
	WebElement ele1=cd.findElement(By.xpath("//li[@id='credit2']"));
	// Inspect 2nd element and store in ele2
	WebElement ele2=cd.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Thread.sleep(2000);
	// Object of Actions Class
	Actions act=new Actions(cd);
	act.dragAndDrop(ele1, ele2).perform();
	Thread.sleep(2000);

	Actions act1=new Actions(cd);
	// Inspect 3rd element and store in ele3
	WebElement ele3=cd.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	// Inspect 4th element and store in ele4
	WebElement ele4=cd.findElement(By.xpath("//ol[@id='amt7']"));
	act1.dragAndDrop(ele3, ele4).perform();
	Thread.sleep(2000);
	
	Actions act2=new Actions(cd);
	// Inspect 5th element and store in ele5
	WebElement ele5=cd.findElement(By.xpath("//li[@id='credit1']"));
	// Inspect 6th element and store in ele6
	WebElement ele6=cd.findElement(By.xpath("//ol[@id='loan']"));
	act2.dragAndDrop(ele5, ele6).perform();
	Thread.sleep(2000);
	
	Actions act3=new Actions(cd);
	// Inspect 7th element and store in ele7
	WebElement ele7=cd.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	// Inspect 8th element and store in ele8
	WebElement ele8=cd.findElement(By.xpath("//ol[@id='amt8']"));
	act3.dragAndDrop(ele5, ele6).perform();
	
	
	
	
}	

}
