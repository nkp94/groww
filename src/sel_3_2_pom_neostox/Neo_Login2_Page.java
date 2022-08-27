package sel_3_2_pom_neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neo_Login2_Page {
	
	// Declaration
	@FindBy(xpath = "//input[@id='txt_accesspin']")private WebElement PWD;
	@FindBy(xpath = "//a[@id='lnk_submitaccesspin']")private WebElement SB2;
	//Initialization
	public Neo_Login2_Page(WebDriver D) {
		PageFactory.initElements(D,this);
	}
	
	//Utilization
	public void enterID() {
		PWD.sendKeys("2854");
		
		
	}
	public void ClickSB2() {
		SB2.click();
	}
	

}
