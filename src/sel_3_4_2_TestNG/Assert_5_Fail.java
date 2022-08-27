package sel_3_4_2_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_5_Fail {
	@Test
public void TC5() {
	Reporter.log("Running TC5",true);
	
	Assert.fail();//                        -----> Verification 1
	// Console --> java.lang.AssertionError: null
	System.out.println("I am After Fail");//-----> Verification 1
}
	@Test
	public void TC6() {
	Reporter.log("Running TC6",true);
	
	}
}
