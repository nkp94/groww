package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags_invocation_4_1 {

	@Test(invocationCount = 5)
public void TC() {
	Reporter.log("Running TC",true);
}
	
}
