package Sel_2_7_drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class D {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    
    driver.get("https://jqueryui.com/droppable/default.html");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    WebElement elem1 = driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement elem2 = driver.findElement(By.xpath("//div[@id='droppable']"));
    Thread.sleep(2000);
    Actions act=new Actions(driver);
    act.dragAndDrop(elem1, elem2).perform();
    
    
}
}
