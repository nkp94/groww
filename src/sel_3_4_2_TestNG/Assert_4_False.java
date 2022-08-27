package sel_3_4_2_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_4_False {
	@Test
public void TC4() {
	Reporter.log("Running TC4",true);
	boolean actR=false;
	Assert.assertFalse(actR);
}
}
