package Sel_2_7_drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	WebDriver ED=new EdgeDriver();
	
	ED.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");
	ED.manage().window().maximize();
	Thread.sleep(2000);
	// Inspect 1st element and store in ele1
	WebElement ele1=ED.findElement(By.xpath("//img[@id='ball']"));
	// Inspect 2nd element and store in ele2
	WebElement ele2=ED.findElement(By.xpath("//img[@id='gate']"));
	Thread.sleep(2000);
	// Object of Actions Class
	Actions act=new Actions(ED);
	act.dragAndDrop(ele1, ele2).perform();
	
	
}	

}
