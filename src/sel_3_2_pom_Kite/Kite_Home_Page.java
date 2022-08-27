package sel_3_2_pom_Kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {

	// Declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	// Initialization
	public Kite_Home_Page(WebDriver D){
		PageFactory.initElements(D,this);
	}
	
	// Utilization
	public void verifyuserID() {
		String ExpID="DPG458";
		String ActID= userID.getText();
		
	   if(ActID.equals(ExpID)) {
		   System.out.println(" TC Is Pass ");
	   }else
	   {
		   System.out.println(" TC Is Fail ");
	   }
	}
	
}
