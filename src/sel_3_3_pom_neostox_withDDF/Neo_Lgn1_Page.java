package sel_3_3_pom_neostox_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Lgn1_Page {
	// Declaration
		@FindBy(xpath = "//input[@id='txt_mobilenumber']")private WebElement UI;
		@FindBy(xpath = "//a[@id='lnk_submitmobnumber']")private WebElement SB;
		//Initialization
		public Neo_Lgn1_Page(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		//Utilization
		public void enterID(String userID) {
			UI.sendKeys(userID);
			
		}

		public void clickSB1() {
			SB.click();
		}

}
