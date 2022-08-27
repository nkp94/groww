package sel_3_2_pom_Acti_Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Home_Page {

	// Declaration 
	@FindBy(xpath = "//a[text()='Enter Time-Track']") private WebElement text ;
	
	// Initialization
	public Acti_Home_Page(WebDriver D) {
		PageFactory.initElements(D,this);
	}
	
	// Utilization
	public void verifyText(){
		String ExpT="Enter Time-Track";
		String ActT= text.getText();
			if(ActT.equals(ExpT)){
				
				System.out.println("Test Case is Pass, ExpT and ActT are matching");
	}else {
		System.out.println("Test case is fail,ActT and ExpT are not matching");
	}
	
			
		}
	
	
}
