package sel_1_1_1_selenium_webdriver_methods;
// Advantages of Selenium
// [1] Open source and free tool
// [2] It will supports multilannguages
// [3] Cross browser / compatability Testing is possible
// [4] Multibrowser testing is possible
// [5] it is Flexible

// Disadvantages of selenium
// [1] We can automate only web based applications
// [2] We can't automate captcha
// [3] We can't automate desktop based applications
// [4] Adhoc test cases can't be automated
// [5] We can't read barcode

//Java Selenium Architecture

//    Selenium webdriver API is communicating with language binding such as java using JSON wire protocol
//   & Combinely they will communicate with browsers with the help of respective driver executable files

//Selenium Flavours

//[1] Selenium IDE ( Integrated Development Environment )
//             we can run script in java only
//             We can't perform compatability testing
//[2] Selenium RC (Remote Control)
//             we can run script in java only
//             We can perform compatability testing it is not stable
//[3] Selenium Webdriver
//             We can perform compatability testing
//             We can run script in different different languages

// Architecture of Selenium Webdriver

// Webdriver Interface:=
//                    As we know all the methods in webdriver interface are incomplete,
//                    so, To complete them Remote webdriver class is implemented 
//      Finally ,Upcasting is done in browser class & webdriver interface

//  searchcontext(I)     --> findelement(),findelements()..Abstract Methods
//  Webdriver(I)       ----> Incomplete &  Abstarct methods

// Remote webdriver(C)  ---> Implementation clas
// Browser Classes(C)   ---> Chromedriver,direfoxdriver

// Webdriver has --> Generalization , 13 methods of webdriver(I) , Runtime polymorphism


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Manage_using_FirefoxDriver {
public static void main(String[]args) throws Throwable  {
	System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\Gecko Driver\\geckodriver.exe");
	 
	WebDriver driver=new FirefoxDriver();
//interface ref.var = key or operator  browser
	//open the url
	//driver.get("https://www.yahoo.com");
	//Thread.sleep(3000);
	
    driver.get("https://www.cricbuzz.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(3000);
	driver.close();
	
}

}
