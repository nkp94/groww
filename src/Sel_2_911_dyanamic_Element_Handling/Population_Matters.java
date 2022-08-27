package Sel_2_911_dyanamic_Element_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Population_Matters {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	 
	 cd.get("https://populationmatters.org/the-facts");
    //get the text of current  world Population count
	String PopMatter = cd.findElement(By.xpath("//div[@id='world-pop']")).getText();
    System.out.println(PopMatter);
	
}
}
