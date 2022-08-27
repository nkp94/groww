package sel_3_4_1_TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_3 {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browser",true);
	}
		@BeforeMethod
		public void loginApp() {
			Reporter.log("login to App",true);
		}
		@Test
		public void verifyID() {
			Reporter.log("verify user id",true);
		}
		@AfterMethod
		public void logoutApp() {
			Reporter.log("logout from App",true);
			
		}
		@AfterClass
		
		public void closebrowser() {
			Reporter.log("close the browser",true);
		}	
	
	
	
	
//	@BeforeClass
//public void open_Browser() {
//		Reporter.log("open browser",true);
//	}
//	@BeforeMethod
//public void login_App(){
//	Reporter.log("Login to app",true);
//}
//	@Test
//public void verifyUID() {
//	Reporter.log("verifyUID",true);
//}
//	@AfterMethod
//public void logout() {
//		Reporter.log("Logout",true);
//	}
//	@AfterClass
//public void close_Browser() {
//		Reporter.log("close browser",true);
//	}
}
