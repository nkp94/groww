package sel_3_2_pom_neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Sign_In_Page {

	//Declaration
	@FindBy(xpath = "//a[text()='Sign In']")private WebElement SGN;
	
	//Initialization
	public Neo_Sign_In_Page(WebDriver D) {
		PageFactory.initElements(D,this);
	}
	
	//Utilization
	public void pressSignIn() {
		SGN.click();	
		
	}
	
	
	
}


