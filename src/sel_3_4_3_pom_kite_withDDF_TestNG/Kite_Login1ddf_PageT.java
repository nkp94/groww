package sel_3_4_3_pom_kite_withDDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1ddf_PageT {

	//Step 1 --> Declaration 
		@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
		@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
		@FindBy(xpath = "//button[text()='Login ']")private WebElement LGNBTN;
		
		//Step 2 --> Initialization
		public Kite_Login1ddf_PageT(WebDriver D) {
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
//public class KiteLogin1pageT {
//	//step1 Declaration
//			@FindBy(xpath="//input[@id='userid']")private WebElement UN;
//			@FindBy(xpath="//input[@id='password']")private WebElement PWD;
//			@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
//		//step2 Initialization
//			public KiteLogin1pageT (WebDriver driver) {
//				PageFactory.initElements(driver,this);
//			}
//		//Utilization
//			public void enterUN(String username ) {
//				UN.sendKeys(username);
//			}
//			public void enterPWD(String password) {
//				PWD.sendKeys(password);
//			}
//			public void clickLOGINBTN() {
//				LOGINBTN.click();
//			}