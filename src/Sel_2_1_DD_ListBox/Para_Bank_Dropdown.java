package Sel_2_1_DD_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Para_Bank_Dropdown {
public static void main(String[]args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chrome driver\\chromedriver.exe");
	WebDriver dd=new ChromeDriver();
	
	dd.get("https://parabank.parasoft.com/parabank/index.htm");
	
	dd.manage().window().maximize();
	Thread.sleep(2000);
	
	dd.findElement(By.xpath("(//input)[1]")).sendKeys("username");
	Thread.sleep(2000);
	
	dd.findElement(By.xpath("(//input)[2]")).sendKeys("password");
	Thread.sleep(2000);
	
	dd.findElement(By.xpath("//input[@class='button']")).click();
	Thread.sleep(1000);
	
	dd.findElement(By.xpath("//a[text()='Products']")).click();
	Thread.sleep(2000);
	
	
	WebElement ld=dd.findElement(By.xpath("//select[@id='gtranslate_selector']"));
	Thread.sleep(2000);

	//dd.findElement(By.xpath("//select[@id='gtranslate_selector']")).click();
	Select s=new Select(ld);
	
	//s.deselectByIndex(1);
	s.selectByIndex(4);
	//Thread.sleep(3000);
	//s.deselectByIndex(2);
	//s.selectByValue("Français");
	//s.selectByValue("English");
	Thread.sleep(4000);
	
	//s.selectByValue("Español");
	String expt="ParaBank | Welcome | Online Banking";
	String act=dd.getTitle();
	if(expt.equals(act)) {
		System.out.println("Test Case Pass");
	}
	else {
		System.out.println("Test Case Is Fail");
	}
	Thread.sleep(3000);
	
}
}
