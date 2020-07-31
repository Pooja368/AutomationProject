package com.smart.qa.testutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.smart.qa.base.TestBaseClass;

public class DropDownMethods extends TestBaseClass {
	
	static Select select;
	
	public static void selectDropDownByVisibleText(WebElement element, String VisibleText)
	{	select=new Select(element);
		select.selectByVisibleText(VisibleText);
	}
	public static void selectDropDownByValue(WebElement element, String value)
	{	select=new Select(element);
		select.selectByValue(value);
	}
	public static void selectDropDownByIndex(WebElement element, int index)
	{   select=new Select(element);
		select.selectByIndex(index);
	}
	public static void deselectAllValues(WebElement element)
	{   select=new Select(element);
		select.deselectAll();
	}
	public static void deSelectDropDownByVisibleText(WebElement element, String VisibleText)
	{	select=new Select(element);
		select.deselectByVisibleText(VisibleText);
	}
	public static void deSelectDropDownByValue(WebElement element, String value)
	{	select=new Select(element);
		select.deselectByValue(value);
	}
	public static void deSelectDropDownByIndex(WebElement element, int index)
	{   select=new Select(element);
		select.deselectByIndex(index);
	}
	
}
