package Sel_2_1_DD_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_DD_Autosuggestions {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// Open the browser
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
	Thread.sleep(3000);
	
	// Inspect Elements
	
	List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	
	//Use for-each loop
	for(WebElement oneoption:alloptions) {
		String text = oneoption.getText();
		System.out.println(text);
		
//		if(text.contains("kgf 3 release date")) {
//			oneoption.click();
//			Thread.sleep(3000);
//			if(text.contains("kgf full form")) {
//				oneoption.click();
//				Thread.sleep(3000);
//				if(text.contains("K.G.F: Chapter 1")) {
//					oneoption.click();
//					Thread.sleep(3000);
//					if(text.contains("kgf 2 box office collection")) {
//						oneoption.click();
//						Thread.sleep(3000);
//						if(text.contains("K.G.F Chapter 3")) {
//							oneoption.click();
//							Thread.sleep(3000);
							if(text.contains("kgf cast")) {
								oneoption.click();
								Thread.sleep(3000);
			break;
		}
		
	}
}
}
