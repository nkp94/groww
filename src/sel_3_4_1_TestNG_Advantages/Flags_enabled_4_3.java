package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags_enabled_4_3 {
	@Test
	public void TC1() {
	Reporter.log("TC1 Run",true);	
	}
	@Test
	public void TC2() {
	Reporter.log("TC2 Run",true);	
	}
	@Test(enabled = false)
	public void TC3() {
	Reporter.log("TC2 Run",true);
}
}
