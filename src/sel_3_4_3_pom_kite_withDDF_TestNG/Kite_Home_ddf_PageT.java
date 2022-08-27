package sel_3_4_3_pom_kite_withDDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_ddf_PageT {

	// Declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
		
		// Initialization
		public Kite_Home_ddf_PageT(WebDriver D){
			PageFactory.initElements(D,this);
		}
		
		// Utilization
	
		public String verifyuserID() {
			
			String actID = userID.getText();
			return actID;		
		
		}
		}	

//public class KiteHomepageT {
//	//Declaration
//			@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
//			
//			
//			//initialization
//			public  KiteHomepageT(WebDriver driver) {
//				PageFactory.initElements(driver,this);
//			}
//			//utilization
//			public String verifyuserID() {
//				
//				String actID = userID.getText();
//				return actID;