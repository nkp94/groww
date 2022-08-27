package sel_3_4_3_pom_neostox_withDDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Sgn_In_PageT {

	
	//Declaration
		@FindBy(xpath = "//a[text()='Sign In']")private WebElement SGN;
		
		//Initialization
		public Neo_Sgn_In_PageT(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		//Utilization
		public void pressSignIn() {
			SGN.click();	
			
		}
			
	
}
