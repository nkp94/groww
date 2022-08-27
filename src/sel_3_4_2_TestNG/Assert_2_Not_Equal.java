package sel_3_4_2_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_2_Not_Equal {
@Test
public void TC2() {
	Reporter.log("Running TC2",true);
	String ExpR="Nilesh";
	String ActR="Nilesh";
	Assert.assertNotEquals(ExpR, ActR);
}
}
