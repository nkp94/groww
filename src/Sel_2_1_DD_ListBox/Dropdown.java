package Sel_2_1_DD_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// Open the browser
	driver.get("D:\\Automation Testing\\velocity.html");
	//Inspect dropdown
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='Menu']"));
	//Create object of select class which accept webelement arguments
	Select s1=new Select(dropdown);
	// Use method of select class
	
	
	//s1.selectByIndex(1);
	//s1.selectByValue("e");
	//s1.selectByVisibleText("Samosa");
}
}
