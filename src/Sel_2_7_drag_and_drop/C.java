package Sel_2_7_drag_and_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class C {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.opera.driver",
				"D:\\Automation Testing\\Opera Driver\\operadriver_win64\\operadriver.exe");

		WebDriver opd = new OperaDriver();

		opd.get("https://codepen.io/depthdev/full/pNMOdd");
		opd.manage().window().maximize();
		Thread.sleep(1000);
		// Inspect 1st element and store in ele1
		WebElement ele1 = opd
				.findElement(By.xpath("(//section[@class='flagstone-drag-handle flagstone-0-bed__stone'])]1]"));
		// Inspect 2nd element and store in ele2
		WebElement ele2 = opd
				.findElement(By.xpath("(//section[@class='flagstone-drag-handle flagstone-0-bed__stone'])[4]"));
		Thread.sleep(1000);
		// Object of Actions Class
		Actions act = new Actions(opd);
		act.dragAndDrop(ele1, ele2).perform();

	}

}
