package UtilityPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch {

	public static void ExcelData(int row, int col) throws EncryptedDocumentException, IOException, InvalidFormatException {

		String path = "D:\\Sagar\\Velocity\\Software Testing\\Class Lecture Video\\testdata.xlsx";

		for (int i = 0; i <= row; i++)
		{
			for (int j = 0; j <= col; j++)
			{

				FileInputStream file = new FileInputStream(path);

				Sheet s = WorkbookFactory.create(file).getSheet("TestData");
				String value = s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(" " + value);
			}
			System.out.println();
		}
	}
		
	 public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 Fetch.ExcelData(4, 1);
	 }

}
