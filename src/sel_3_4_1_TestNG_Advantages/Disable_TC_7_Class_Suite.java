package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TC_7_Class_Suite {
	@Test
	public void TC1() {
	Reporter.log("TC1 Run",true);	
	}
	@Test
	public void TC2() {
	Reporter.log("TC2 Run",true);	
	}
	// Below is the example of class level changes
	@Test(enabled = false)
	public void TC3() {
	Reporter.log("TC2 Run",true);
}
}

//Below are the Suite Level Changes

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="sel_3_4_1_TestNG_Advantages.Flags_enabled_4_3">
//       <methods><exclude name="TC2"></exclude></methods>
//      </class>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->
