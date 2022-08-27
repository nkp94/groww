package sel_2_912_Parameterization_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIS {
public static void main(String[]String) throws Throwable, IOException {
	
	// Create Object of file input stream
	
	 FileInputStream fis=new FileInputStream("C:\\Users\\Nilesh Patil\\Desktop\\data1.xlsx");
	 
	//From WorkbookFactory class we have to use Create Method 
	  double datas = WorkbookFactory.create(fis).getSheet("data").getRow(5).getCell(0).getNumericCellValue();
	  System.out.println(datas);
	
}

}
