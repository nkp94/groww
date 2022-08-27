package sel_1_2_cases_Of_Relative_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class By_Group_Index_op_flipkart {
	//----> (xpath expression)[index]	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.opera.driver","D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");
	WebDriver opd=new OperaDriver();
	
	opd.get("https://www.flipkart.com/");
	Thread.sleep(3000); 
	
	
	
	opd.findElement(By.xpath("(//input)[7]")).sendKeys("9834753809");
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//input)[8]")).sendKeys("Nils@1234");
	Thread.sleep(2000);
	
	opd.findElement(By.xpath("(//button)[3]")).click();
	
	String Expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	String Actt=opd.getTitle();
	
	if(Actt.equals(Expt)) {
		System.out.println("Test Case Is Pass");
	}else {
		System.out.println("Test Case Is Fail");
	}
	
}
}
