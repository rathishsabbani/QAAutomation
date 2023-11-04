package com.genericlibraies;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
	

	public FileInputStream fis;


	   public int readrowcount(String sheetname) throws IOException
	    {
	        fis= new FileInputStream("C:\\Users\\ABC\\eclipse-workspace\\QAautomation\\Dataprovidersheet.xlsx");
	        Workbook wb= WorkbookFactory.create(fis);
	        int rows=wb.getSheet(sheetname).getLastRowNum();
	        return rows;    
	    }
	    
	    
	    public int readcolumncount(String sheetname, int rownum) throws IOException
	    {
	        
	        fis= new FileInputStream("C:\\Users\\ABC\\eclipse-workspace\\QAautomation\\Dataprovidersheet.xlsx");
	        Workbook wb= WorkbookFactory.create(fis);
	        
	        int column=wb.getSheet(sheetname).getRow(rownum).getLastCellNum();
	        return column;
	        
	    }
	    
	    public String readdatafromexcel(String sheetname, int row, int cell) throws IOException
	    {
	        
	        fis= new FileInputStream("C:\\Users\\ABC\\eclipse-workspace\\QAautomation\\Dataprovidersheet.xlsx");
	        Workbook wb= WorkbookFactory.create(fis);
	        String data=wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	        return data;
	    }
	    

	}


