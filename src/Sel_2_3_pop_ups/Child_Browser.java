package Sel_2_3_pop_ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {//Window Handling / Handling New Tabs/ New Window
//Characteristics = 1) We Can Inspect 
//	                2) It contains URL ,Maximize,Minimize,Close Button
//                  3) Each and every window will generate session 
public static void main(String[] args) throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	 WebDriver d=new ChromeDriver();
	 
	 d.get("https://www.flipkart.com/");
	 
	 d.findElement(By.xpath("//button[text()='✕']")).click();
	 d.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
	 d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 Thread.sleep(2000);
	 d.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	 Thread.sleep(2000);
	//by default selenium control should be on main window we have switch it from main window to child
	    Set<String> allws = d.getWindowHandles();
	    for(String singlewin:allws) {
	    	d.switchTo().window(singlewin);//now ur selenium control goes from main win to child
	    }
	    //get the text of child for our confirmation
	    Thread.sleep(3000);
	    String expT="realme C11 2021 (Cool Blue, 32 GB)  (2 GB RAM)";
	    String actT = d.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	    System.out.println(actT);
	    //verify the child window handle or not
	    Thread.sleep(3000);
	    if(actT.equals(expT)) {
	    	System.out.println("child window is handled and TC is pass");
	    }
	    else {
	    	System.out.println("Tc is fail");
	    }
	 
}	
}
