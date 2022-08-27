package sel_3_3_pom_kite_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2ddf_Page {

	  //Declaration 
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath = "//button[text()='Continue ']")private WebElement CONBTN;
		
		//Initialization 
		public Kite_Login2ddf_Page(WebDriver D) {
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
