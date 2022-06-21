package com.crm.SDET35.genericutilities;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * @author Sanskar Shrivastava
 *
 */

public class FileUtility {

	/**
	 * 
	 * It is used to get common data from properties based on the key provided by you
	 * @return
	 * 
	 */
	
	public String getProperty(String path,String key) throws Throwable
	{
		
	  FileInputStream fis=new FileInputStream(path);
	  Properties properties=new Properties();
	  properties.load(fis);
	  String value=properties.getProperty(key);
	  return value;
	}

	}


