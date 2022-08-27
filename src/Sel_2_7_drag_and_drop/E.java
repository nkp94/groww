package Sel_2_7_drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	
	cd.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	cd.manage().window().maximize();
	Thread.sleep(3000);
	
	// Inspect 1st element and store in ele1
	WebElement ele1=cd.findElement(By.xpath("//div[@id='box6']"));
	// Inspect 2nd element and store in ele2
	WebElement ele2=cd.findElement(By.xpath("//div[@id='box106']"));

	// Inspect 3rd element and store in ele3
	WebElement ele3=cd.findElement(By.xpath("//div[@id='box1']"));
	// Inspect 4th element and store in ele4
	WebElement ele4=cd.findElement(By.xpath("//div[@id='box101']"));

	// Inspect 5th element and store in ele5
	WebElement ele5=cd.findElement(By.xpath("//div[@id='box5']"));
	// Inspect 6th element and store in ele6
	WebElement ele6=cd.findElement(By.xpath("//div[@id='box105']"));

	// Inspect 7th element and store in ele7
	WebElement ele7=cd.findElement(By.xpath("//div[@id='box3']"));
	// Inspect 8th element and store in ele8
	WebElement ele8=cd.findElement(By.xpath("//div[@id='box103']"));

	// Inspect 9th element and store in ele9
	WebElement ele9=cd.findElement(By.xpath("//div[@id='box7']"));
	// Inspect 10th element and store in ele10
	WebElement ele10=cd.findElement(By.xpath("//div[@id='box107']"));

	// Inspect 11th element and store in ele11
	WebElement ele11=cd.findElement(By.xpath("//div[@id='box4']"));
	// Inspect 12th element and store in ele12
	WebElement ele12=cd.findElement(By.xpath("//div[@id='box104']"));
	
	// Inspect 13th element and store in ele13
	WebElement ele13=cd.findElement(By.xpath("//div[@id='box2']"));
	// Inspect 14th element and store in ele14
	WebElement ele14=cd.findElement(By.xpath("//div[@id='box102']"));
	Thread.sleep(2000);
	
	// Object of Actions Class
	
	Actions act=new Actions(cd);
	
	act.dragAndDrop(ele1, ele2).perform();
	Thread.sleep(2000);
	act.dragAndDrop(ele3, ele4).perform();
	Thread.sleep(2000);
	act.dragAndDrop(ele5, ele6).perform();
	Thread.sleep(2000);
	act.dragAndDrop(ele7, ele8).perform();
	Thread.sleep(2000);
	act.dragAndDrop(ele9, ele10).perform();
	Thread.sleep(2000);
	act.dragAndDrop(ele11, ele12).perform();
	Thread.sleep(2000);
	act.dragAndDrop(ele13, ele14).perform();
	Thread.sleep(2000);


	
	
	
	
	
	
	
}	

}
