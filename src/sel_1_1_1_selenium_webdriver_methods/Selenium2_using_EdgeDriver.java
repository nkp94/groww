package sel_1_1_1_selenium_webdriver_methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium2_using_EdgeDriver {
public static void main(String[]args) throws Throwable  {
	System.setProperty("webdriver.edge.driver","D:\\Automation Testing\\Edge Driver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();//---> Upcasting
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
