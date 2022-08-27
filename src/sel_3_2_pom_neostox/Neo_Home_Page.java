package sel_3_2_pom_neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Home_Page {

	// Declaration
	
	@FindBy(xpath = "//span[@id='ctl00_lbl_username']")private WebElement title;
	
	// Initialization
	
	public Neo_Home_Page(WebDriver D) {
		PageFactory.initElements(D,this);
	}
	
	// Utilization
	public void getText() {
		String ExpT="Hi Nilesh";
		String ActT=title.getText();
		if(ActT.equals(ExpT)) {
			System.out.println(" TC Is Pass ");
		}else {
			System.out.println("TC Is Fail");
		}
		
	}
	
	
}
