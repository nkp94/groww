package sel_3_2_pom_Acti_Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Login_Page {
 
	// Declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement Login;
	
	// Initialization
	public Acti_Login_Page(WebDriver D) {
		PageFactory.initElements(D,this);
	}
	
	// Utilization
	public void enterUN(){
		UN.sendKeys("admin");
	}
	public void enterPWD() {
		PWD.sendKeys("manager");
	}
	public void clickLogin() {
		Login.click();
	}
	
}
