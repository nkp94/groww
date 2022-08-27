package sel_3_4_2_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Class {
	@Test
public void TC1() {
	Reporter.log("Running TC5",true);
	String ExpR="Nilesh";
	String ActR="Nil";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(ExpR, ActR);      //-----> Verification 1
	
	System.out.println("I am After Failed Verification");//-----> Verification 2
	
	// Mandatory use assertALL()
	soft.assertAll(); // If we are not writing this then there is no value for 
	
}
	@Test
	public void TC2() {
	Reporter.log("Running TC2",true);
	
	}
}
