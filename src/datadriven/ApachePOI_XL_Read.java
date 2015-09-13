package datadriven;

import org.apache.*;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaError;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


class UserDetails 
{
	
	String xlsxName;
	String [] dataSheetNames;
	
	int noOfSheets;
	
	
	List <XSSFTable> data;

	XSSFWorkbook wb;
	
	UserDetails (String sXlsxFileName) throws Exception
	{
		File file = new File(sXlsxFileName);
		if (! file.exists())
		{
			System.out.println("Data File" + sXlsxFileName + " could not found ... Please check it.");
		}
		
		noOfSheets = 0;
		setXlsxName (sXlsxFileName);
		initWBK ();
		//printWBKData();
		
				
	}
	
	public XSSFSheet getSheetAt (int i)
	{
		if (noOfSheets == 0)
			return null;
		
		return wb.getSheetAt(i);
		
	}

	public String [][] fetchUserDetails ()
	{
		
		XSSFSheet aSheet = wb.getSheet("UserDetails");

		if (aSheet.getPhysicalNumberOfRows() <= 0)
			return null;
		
		int rowCount = aSheet.getLastRowNum() + 1;
		
		int colCount = aSheet.getRow(0).getLastCellNum();
		
		
		String [] [] data = new String [rowCount] [colCount];
		
		int i=0;
		int j =0;
		
		for (i=0; i<rowCount ; i++)
		{
			for (j=0; j<colCount; j++)
			{
				//System.out.println("i="+(i+1)+" j="+(j+1)+ "==>" +aSheet.getRow(i).getCell(j));
				data [i][j] = aSheet.getRow(i).getCell(j).toString();
				//System.out.println(data [i][j]);
			}
		}
		
		System.out.println(Arrays.asList(data[0]).toString());
		
		return data;
		

	}
	
	public ArrayList [] getUserDetails ()
	{
		if (noOfSheets == 0)
			return null;
		
		XSSFSheet aSheet = wb.getSheet("UserDetails");

		if (aSheet.getPhysicalNumberOfRows() < 0)
			return null;
		
		ArrayList[] data = new ArrayList [1000]; 
		
		Iterator <Row> rowItr = aSheet.rowIterator();
		
		int i = 0;
		int j = 0;
		
		
		System.out.println();
		
		while (rowItr.hasNext())
		{
			Iterator <Cell> cellItr = rowItr.next().cellIterator();
		
			data[i] = new ArrayList ();
			
			j=0;
			
			while (cellItr.hasNext() )
			{
				String aCellVal = cellItr.next().toString();
				//System.out.println(aCellVal);
				
				data[i].add(j, aCellVal);
				j++;
			}
			i++;
		}
				
		return data;
	}

	private void setXlsxName(String sXlsxFileName) {
		this.xlsxName = sXlsxFileName;
	}

	private void initWBK ( ) throws Exception
	{		
		File file = new File(xlsxName);
		
		FileInputStream fi;
		fi = new FileInputStream(file);
		wb  = new XSSFWorkbook (fi);
		
		noOfSheets = wb.getNumberOfSheets();
		dataSheetNames = new String [noOfSheets];
		
		for (int i=0; i< noOfSheets ; i++ )
		{
			dataSheetNames [i] = wb.getSheetName(i);
		}
		
	}
	
	private void printWBKData ()
	{
		if (wb == null)
			return;
		
		System.out.println("Worksheets: [" + dataSheetNames.length + "]");
		
		for (String aStr : dataSheetNames) 
			System.out.println("\t"+aStr);

		for (int i=0; i< dataSheetNames.length ; i++ )
		{
			XSSFSheet aSheet = wb.getSheetAt(i);
			
			if (aSheet.getPhysicalNumberOfRows() < 1)
				continue;
			
			System.out.println();
			System.out.println("Worksheets Cell(" + (i+1) +") Data: Rows = [" + aSheet.getPhysicalNumberOfRows() + "]" );

			for (Row aRow : aSheet){
				for (Cell aCell : aRow){
					System.out.print(aCell + "\t");
				}
				System.out.println();
			}
		}
	}
}


public class ApachePOI_XL_Read {

	
	final static String sFileName = "/Users/ppalanisamy/Desktop/CCAutoData.xlsx";
	
	public static void main (String [] args)
	{

		try
		{
			
			UserDetails userDetails = new UserDetails(sFileName);
			
			userDetails.fetchUserDetails();
			
	
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}
		
	}
	
}
