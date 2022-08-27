package sel_3_3_pom_neostox_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Sgn_In_Page {

	
	//Declaration
		@FindBy(xpath = "//a[text()='Sign In']")private WebElement SGN;
		
		//Initialization
		public Neo_Sgn_In_Page(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		//Utilization
		public void pressSignIn() {
			SGN.click();	
			
		}
			
	
}
