package sel_3_4_2_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_3_True {
	@Test
public void TC3() {
	Reporter.log("Running TC3",true);
	boolean actR=true;
	Assert.assertTrue(actR);
}
}
