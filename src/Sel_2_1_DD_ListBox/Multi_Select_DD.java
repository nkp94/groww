package Sel_2_1_DD_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_DD {
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	
	WebDriver msdd=new ChromeDriver();
	
	msdd.get("file://D:/Automation%20Testing/dropdown/Paradise.html");
	
	// To Inspect The Drop Down
	
	WebElement dd=msdd.findElement(By.xpath("//select[@id='PARADISE']"));
	
	//Create object of select class which accept webelement arguments
	
	Select s=new Select(dd);
	//Check Whether the dd is multiselectable or not
	if(s.isMultiple()) {
		System.out.println(" Given dd is multiselectable");
	}
	else {
		System.out.println("Given dd is Not multiselectable");
	}
	
	//get size of all options
	List<WebElement> AllElements = s.getOptions();
	System.out.println(AllElements.size());
	
	// Get the text of all elements
	for(int i=0;i<=AllElements.size()-1;i++) {
		Object webelement;
		WebElement onelement = AllElements.get(i);
		String text = onelement.getText();
		System.out.println(text);
		
		
	}
	
	
	
}
}
