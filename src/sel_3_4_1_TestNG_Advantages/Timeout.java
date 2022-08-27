package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut=5000)
public void TC() {
	Reporter.log("Hii",true);
	
}
}
