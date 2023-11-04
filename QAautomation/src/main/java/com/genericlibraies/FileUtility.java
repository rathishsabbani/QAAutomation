package com.genericlibraies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readDatafromProfile(String key) throws Throwable 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ABC\\eclipse-workspace\\QAautomation\\propertyfile.txt");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key,"Incorrectkey");
		
		
		
		

	}

}
