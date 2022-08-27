package sel_3_2_pom_Kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1_Page {// BLC
	
	//Step 1 --> Declaration 
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[text()='Login ']")private WebElement LGNBTN;
	
	//Step 2 --> Initialization
	public Kite_Login1_Page(WebDriver D) {
		PageFactory.initElements(D,this);
	}
	
	//Step 3 --> Utilization
	public void enterUN() {
		UN.sendKeys("DPG458");
	}
	public void enterPWD() {
		PWD.sendKeys("Amol@1234");
	}
	public void clickLGNBTN() {
		LGNBTN.click();
	}
	
}
