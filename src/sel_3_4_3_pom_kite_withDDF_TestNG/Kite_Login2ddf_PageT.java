package sel_3_4_3_pom_kite_withDDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2ddf_PageT {

	  //Declaration 
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath = "//button[text()='Continue ']")private WebElement CONBTN;
		
		//Initialization 
		public Kite_Login2ddf_PageT(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		//Utilization
		public void enterPIN(String PINvalue) {
			PIN.sendKeys(PINvalue);
		}
		public void clickCONBTN() {
			CONBTN.click();
		}
}
//public class KiteLogin2pageT {
//	//Declaration
//			@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
//			@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntBtn;
//			
//			
//			//Initialization
//			public KiteLogin2pageT(WebDriver driver) {
//				PageFactory.initElements(driver,this);
//			}
//			//utilization
//			public void enterPIN(String pinvalue) {
//				PIN.sendKeys(pinvalue);
//			}
//			public void clickcntBtn() {
//				cntBtn.click();