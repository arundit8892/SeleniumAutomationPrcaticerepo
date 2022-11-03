package testCasesSecond;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objrepo2.HomePageOR;
import objrepo2.TestingFormPageOR;
import utilities2.BaseClass2modifiedWithBy;

public class TC3Modified extends BaseClass2modifiedWithBy {
	@Test(priority=1)
	public void presetUp() {
		openBrowser("chrome");
		openUrl("https://seleniumautomationpractice.blogspot.com/");
		waitImplicit(15);
		
	}
	@Test(priority=2)
	public void navigateToTestingFormPage() {
		HomePageOR.clickTestingHomePage();
		
	}
	@Test(priority=3,dataProvider="getDataFrom")
	public void formFilling(String fname,String lname,String add,String nation,String gender, String interest) {
		TestingFormPageOR.formFill(fname, lname, add, nation, gender, interest);
		
	}
	@DataProvider
	public Object[][] getDataFrom() throws Exception {
		
		// File location should be specified over here to read the data from
		
		FileInputStream fis = new FileInputStream(".\\src\\dataset\\Book1.xlsx");
		
		
		// open work book
		
		Workbook wb = WorkbookFactory.create(fis);
		
		
		// declare the sheet you want to read
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rowno =sh.getLastRowNum()+1;
		int colno =sh.getRow(0).getLastCellNum();   
		Object[][] dataSet= new Object[rowno][colno];
		
		for(int row=0 ;row <rowno ;row++)
		{
			for(int col=0;col<colno;col++)
			{
				  dataSet[row][col]=sh.getRow(row).getCell(col).toString();
			}
			
		}
		
		return dataSet;
		
		
	}
	@Test(priority=4)
	public void alert() {
		alertAction("ok");
	}

}
