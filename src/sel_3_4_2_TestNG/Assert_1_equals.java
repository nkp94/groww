package sel_3_4_2_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Assert_1_equals {
@Test
public void TC1(){
	Reporter.log("TC1 Is Running",true);
	String ExpR="Nilesh";
	String ActR="Nilesh";
	Assert.assertEquals(ExpR, ActR);
	
}
}
