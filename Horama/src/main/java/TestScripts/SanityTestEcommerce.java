package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SanityTestEcommerce {
	
	ECOMMERCETest ec=new ECOMMERCETest();
@Test
public void SanityTest() throws IOException
{		// TODO Auto-generated method stub
	FileInputStream FIS=new FileInputStream("D:\\Final\\Repo\\Horama\\TestData\\UserData.xlsx");//Open EXcel
	//XSSFWorkbook
	XSSFWorkbook WOB=new XSSFWorkbook(FIS); //Connect with Excel
	XSSFSheet WOS=WOB.getSheet("Smoke");
	System.out.println(WOS.getLastRowNum());
	Row r;
	for(int i=1;i<=WOS.getLastRowNum()+1;i++)
	{r=WOS.getRow(i);
	if(r.getCell(1).getStringCellValue().equals("Y")&r.getCell(0).getStringCellValue().equals("VerifyUserNavigatingToWebsiteOrNot"))
	{
		
		
		ec.VerifyUserNavigatingToWebsiteOrNot();
	}
	else if(r.getCell(1).getStringCellValue().equals("Y")&r.getCell(0).getStringCellValue().equals("VerifySignUp"))
	{
		
		
		try {
			ec.VerifySignUp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	else if(r.getCell(1).getStringCellValue().equals("Y")&r.getCell(0).getStringCellValue().equals("VerifyLogin"))
	{
		
		
		try {
			ec.VerifyLogin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(r.getCell(1).getStringCellValue().equals("Y")&r.getCell(0).getStringCellValue().equals("ClickOnProductandVerifyProductView"))
	{
		
		
		try {
			ec.ClickOnProductandVerifyProductView();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(r.getCell(1).getStringCellValue().equals("Y")&r.getCell(0).getStringCellValue().equals("VerifAddtoCartandProceedtoBuy"))
	{
		
		
		try {
			ec.VerifAddtoCartandProceedtoBuy();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(r.getCell(1).getStringCellValue().equals("Y")&r.getCell(0).getStringCellValue().equals("ConfirmAddressandPlaceOrder"))
	{
		
		
		
			ec.ConfirmAddressandPlaceOrder();
		
	}
	
		
	
	
		
	}
	

}
}
