package testCasesSecond;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class TestingOfExcelReading {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\src\\dataset\\Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		
		int rowno = sh.getLastRowNum()+1;
		int colno =sh.getRow(0).getLastCellNum();
		System.out.println("the last row Number is " +rowno);
		System.out.println("last colum is "+colno);
		
		Object[][] data = new Object[rowno][colno];
		
		for (int row =0;row<rowno;row++)
		{
			for(int col=0;col<colno;col++ )
				
			{
			
				 data[row][col] =sh.getRow(row).getCell(col).toString();
				
			}
			
		}
	     

	}

}
