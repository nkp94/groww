package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags_dependsonmethods_4_5 {
	@Test
	public void login() {
	Reporter.log("login",true);	
	}
	@Test(dependsOnMethods ={"login"})
	public void logout() {
	Reporter.log("logout",true);	
	}
}