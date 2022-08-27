package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_Attribute_ff3_flipkart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver ffdriver = new FirefoxDriver();
	
	ffdriver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	ffdriver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9834753809");
	Thread.sleep(3000);
	
	ffdriver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Nils@1234");
	Thread.sleep(3000);
	
	ffdriver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	String expT="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	String actT =ffdriver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("Test Case is Pass");
	}
	else {
		System.out.println(" Test case is fail,expT and actT are not matching");
	}
	
}
}
