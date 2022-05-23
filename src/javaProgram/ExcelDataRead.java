package javaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {

	    File filobj=new File("C:\\Users\\HP\\Desktop\\Myxlsfile.xlsx");
	
		InputStream stream= new FileInputStream(filobj);

	      Workbook work= new XSSFWorkbook(stream);
	   Sheet sheetobj=   work.getSheet("Sheet1");
	 String cell=  sheetobj.getRow(4).getCell(0).getStringCellValue();
	System.out.println(cell);
	}

}
