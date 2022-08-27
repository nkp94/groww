package sel_3_3_pom_Acti_Time_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Login1_Page {

	// Declaration
		@FindBy(xpath = "//input[@id='username']")private WebElement UN;
		@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
		@FindBy(xpath = "//div[text()='Login ']")private WebElement Login;
		
		// Initialization
		public Acti_Login1_Page(WebDriver D) {
			PageFactory.initElements(D,this);
		}
		
		// Utilization
		public void enterUN(String Userid){
			UN.sendKeys(Userid);
		}
		public void enterPWD(String Password) {
			PWD.sendKeys(Password);
		}
		public void clickLogin() {
			Login.click();
		}	
}
