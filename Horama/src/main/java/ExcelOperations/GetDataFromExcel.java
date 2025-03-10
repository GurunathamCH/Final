package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream FIS=new FileInputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");//Open EXcel
//XSSFWorkbook
XSSFWorkbook WOB=new XSSFWorkbook(FIS); //Connect with Excel
XSSFSheet WOS=WOB.getSheet("Data");
System.out.println(WOS.getLastRowNum());
Row r;
r=WOS.getRow(0);//Get row
System.out.println("Get 1 row 1 column value "+r.getCell(0).getNumericCellValue());
System.out.println("Get 1 row 2 column value "+r.getCell(1).getStringCellValue());
System.out.println("Get 1 row 3 column value "+r.getCell(2).getDateCellValue());

r=WOS.getRow(1);
System.out.println("Get 2 row 1 column value "+r.getCell(0).getNumericCellValue());
System.out.println("Get 2 row 2 column value "+r.getCell(1).getStringCellValue());
System.out.println("Get 2 row 3 column value "+r.getCell(2).getDateCellValue());

r=WOS.createRow(2);//Create Row

r.createCell(0).setCellValue(3.789);
r.createCell(1).setCellValue("EDRC");
r.createCell(2).setCellValue("02/01/2025");

FileOutputStream FOS=new FileOutputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");
WOB.write(FOS);//Save Excel
System.out.println("Printing Using For loop");
for(int i=0;i<WOS.getLastRowNum();i++)  //3
{
	r=WOS.getRow(i);
	
	System.out.println("Get 1 row 1 column value "+r.getCell(0).getNumericCellValue());
	System.out.println("Get 1 row 2 column value "+r.getCell(1).getStringCellValue());
	System.out.println("Get 1 row 3 column value "+r.getCell(2).getDateCellValue());
	
	
	

}

	}

}
