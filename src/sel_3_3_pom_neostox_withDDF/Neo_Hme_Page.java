package sel_3_3_pom_neostox_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Hme_Page {

	// Declaration
	
		@FindBy(xpath = "//span[@id='ctl00_lbl_username']")private WebElement text;
		
		// Initialization
		
		public Neo_Hme_Page(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		// Utilization
		public void getText(String ExpT) {
			//String ExpT="Hi Nilesh";
			String ActT=text.getText();
			if(ActT.equals(ExpT)) {
				System.out.println(" TC Is Pass ");
			}else {
				System.out.println("TC Is Fail");
			}
			
		}
			
	
}
