package sel_3_3_pom_kite_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1ddf_Page {

	//Step 1 --> Declaration 
		@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
		@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
		@FindBy(xpath = "//button[text()='Login ']")private WebElement LGNBTN;
		
		//Step 2 --> Initialization
		public Kite_Login1ddf_Page(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		//Step 3 --> Utilization
		public void enterUN(String UserID) {
			UN.sendKeys(UserID);
		}
		public void enterPWD(String PassWD) {
			PWD.sendKeys(PassWD);
		}
		public void clickLGNBTN() {
			LGNBTN.click();
		}
	
	
}
