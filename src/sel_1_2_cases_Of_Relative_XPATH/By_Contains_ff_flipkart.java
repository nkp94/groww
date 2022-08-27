package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_Contains_ff_flipkart {
//  for using attributes
//  ex ---> //tagname[contains(@AN,'AV')]
//  for using text	
//	ex ----> //tagname[contains(text(),'text')]		
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
    WebDriver ffd = new FirefoxDriver();
	
	ffd.get("https://www.flipkart.com/");
	Thread.sleep(3000); 
	
	

	ffd.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("9834753809");
	Thread.sleep(2000);
	
	ffd.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]")).sendKeys("Nils@1234");
	Thread.sleep(2000);
	
	ffd.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	String Expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	String Actt=ffd.getTitle();
	
	if(Actt.equals(Expt)) {
		System.out.println("Test Case Is Pass");
	}else {
		System.out.println("Test Case Is Fail");
	}
	
}
}
