package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch_Execution_5_Sample1 {
	@Test
	public void TC1() {
	Reporter.log("TC1 Run",true);	
	}
	@Test
	public void TC2() {
	Reporter.log("TC2 Run",true);	
	}
}
