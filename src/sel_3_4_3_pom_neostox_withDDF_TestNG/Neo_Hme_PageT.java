package sel_3_4_3_pom_neostox_withDDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Hme_PageT {

	// Declaration
	
		@FindBy(xpath = "//span[@id='ctl00_lbl_username']")private WebElement text;
		
		// Initialization
		
		public Neo_Hme_PageT(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		// Utilization
		public String verifyuserID() {
			//String ExpT="Hi Nilesh";
			
			
      		String ActT=text.getText();
      		return ActT;
//			if(ActT.equals(ExpT)) {
//				System.out.println(" TC Is Pass ");
//			}else {
//				System.out.println("TC Is Fail");
//			}
			
		}
			
	
}
