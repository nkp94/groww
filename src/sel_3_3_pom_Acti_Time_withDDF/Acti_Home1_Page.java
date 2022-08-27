package sel_3_3_pom_Acti_Time_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Home1_Page {

	// Step 1 = Declaration
	@FindBy(xpath = "//a[text()='Enter Time-Track']")
	private WebElement text;

	// Strp 2 = Initialization
	public Acti_Home1_Page(WebDriver D) {
		PageFactory.initElements(D, this);
	}

	// Step 3 = Utilization
	public void verifyText() {
		String ExpT = "Enter Time-Track";
		String ActT = text.getText();
		if (ActT.equals(ExpT)) {

			System.out.println("Test Case is Pass, ExpT and ActT are matching");
		} else {
			System.out.println("Test case is fail,ActT and ExpT are not matching");
		}

	}
}