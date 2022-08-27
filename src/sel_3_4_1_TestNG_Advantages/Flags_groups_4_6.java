package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags_groups_4_6 {
	@Test
	public void login() {
	Reporter.log("login",true);	
	}
	@Test(alwaysRun = true)
	public void logout() {
	Reporter.log("logout",true);	
	}
}