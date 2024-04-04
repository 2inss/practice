package com.own_project.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FileLib {
	public static WebDriver driver;

	public String getpropertydata(String key) throws IOException
	{
		String path="./src/test/resources/data/ownproject.property";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

	public String getexceldata(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		String path="./src/test/resources/data/crm2.0.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		return  wb.getSheet(sheetname).getRow(row).getCell(cell).toString();	
		
	}
	public void writebackdata(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		String path="./src/test/resources/data/crm2.0.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}
	public void selectindex(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void selectbyvalue(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void selectbyvisibility(WebElement element,String visibility)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibility);
	}
	public void writeclick(WebElement element)
	{
		Actions s=new Actions(driver);
		s.contextClick(element);
	}
	public void doubleclick(WebElement element)
	{
		Actions s=new Actions(driver);
		s.doubleClick();
	}
	public void DragandDrop(WebElement element,WebElement element1)
	{
		Actions s=new Actions(driver);
		s.dragAndDrop(element, element1);
	}
	public void mousehover(WebElement element)
	{
		Actions s=new Actions(driver);
		s.moveToElement(element);
	}
}
