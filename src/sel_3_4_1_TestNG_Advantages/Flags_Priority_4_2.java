package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags_Priority_4_2 {
@Test(priority = 4)
public void TC1() {
	Reporter.log("I'm Nilesh Patil",true);
}
@Test(priority = 1)
public void TC2() {
	Reporter.log("Hii",true);
}
@Test(priority = 2)
public void TC3() {
	Reporter.log("Hello,I'm AkshayKumar",true);
}
@Test(priority = 3)
public void TC4() {
	Reporter.log("What's ur name",true);
}
@Test(enabled = false)
public void TC5() {
	Reporter.log("OK",true);
}
}
