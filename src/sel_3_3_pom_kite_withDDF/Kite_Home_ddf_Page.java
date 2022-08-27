package sel_3_3_pom_kite_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_ddf_Page {

	// Declaration
		@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
		
		// Initialization
		public Kite_Home_ddf_Page(WebDriver D){
			PageFactory.initElements(D,this);
		}
		
		// Utilization
		public void verifyuserID(String ExpID) {

			String ActID= userID.getText();
			
		   if(ActID.equals(ExpID)) {
			   System.out.println(" TC Is Pass ");
		   }else
		   {
			   System.out.println(" TC Is Fail ");
		   }
		}	
}
