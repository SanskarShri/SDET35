package com.crm.SDET35.genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is devloped using Apache Poi libraries,which is used to handle Microsoft Excel sheet 
 * @author Sanskar Shrivastava
 *
 */
public class ExcelUtility 
{
	/**
	 * It is used to read data from Excel-Workbook based on below.
	 * @param filePath
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String getExcelCellValue(String filePath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis1=new FileInputStream(filePath);
		Workbook workbook=WorkbookFactory.create(fis1);
		String cellValue=workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		return cellValue;
	}
	/**
	 *It is used to write data in excel file based on below parameter.
	 *@param filePath
	 *@param value
	 *@param sheetName
	 *@param rowNo
	 *@param cellNo
	 *@param cellValue
	 * @throws Throwable
	 */
	public void writeInExcelSheet(String filePath,boolean value,String sheetName,int rowNo,int cellNo,String cellValue) throws Throwable
	{   
		
		FileOutputStream fos=new FileOutputStream(filePath);
		Workbook workbook=WorkbookFactory.create(value);
		workbook.createSheet(sheetName).createRow(rowNo).createCell(cellNo).setCellValue(cellValue);
		workbook.write(fos);
	}
	/**
	 * It is used to read integer data from excel workbook
	 * @param filePath
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getIntegerValueFromExcelCell(String filePath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1=new FileInputStream(filePath);
		Workbook workbook=WorkbookFactory.create(fis1);
		DataFormatter format = new DataFormatter();
		Cell cell=workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
		String value=format.formatCellValue(cell);
		return value;
		
	}
	
	}


