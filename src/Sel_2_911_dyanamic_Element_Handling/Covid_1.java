package Sel_2_911_dyanamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid_1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	 
	 cd.get("https://www.worldometers.info/coronavirus/country/uk");
    //get the text of recovered cases
	String recover = cd.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();
    System.out.println(recover);
	 
	 
}
}
