package com.crm.SDET35.genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It contains java specific libraries like getRandomNumber & getSystemDateAndTimeInISTformat
 * @author Sanskar Shrivastava
 *
 */
public class JavaUtility
{
	/**
	 * it is used to generate a random number within the range of 1000
	 * @return
	 */
	public int getRandomNumber() 
	{
		Random random=new Random();
		int randNum=random.nextInt(1000);
		return randNum;
	}
	/**
	 * it is used to get System date and time in YYYY DD MM format
	 * @return
	 */
	public String getSystemDateAndTimeInISTformat()
	{
		Date date=new Date();
		String dateAndTime=date.toString();
		
		String yyyy=dateAndTime.split(" ")[5];
		String DD=dateAndTime.split(" ")[2];
		int MM=date.getMonth()+1;
		
		String finalFormat=yyyy+" "+DD+" "+MM;
		return finalFormat;
		
	}
	
}
