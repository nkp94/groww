package sel_3_4_3_pom_neostox_withDDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Lgn2_PageT {
	// Declaration
		@FindBy(xpath = "//input[@id='txt_accesspin']")private WebElement PWD;
		@FindBy(xpath = "//a[@id='lnk_submitaccesspin']")private WebElement SB2;
		//Initialization
		public Neo_Lgn2_PageT(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		//Utilization
		public void enterPass(String Password) {
			PWD.sendKeys(Password);
			
			
		}
		public void ClickSB2() {
			SB2.click();
		}
		
}
