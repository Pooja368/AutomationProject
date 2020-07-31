package com.smart.qa.testutility;

import org.openqa.selenium.Alert;

import com.smart.qa.base.TestBaseClass;

public class JavaScriptAlertPopUpHandling extends TestBaseClass{
	static Alert alert=driver.switchTo().alert();
	
	public static void alertForAccept()
	{
	    alert.accept();
	}
	public static void alertForDismiss()
	{
	    alert.dismiss();
	}
	public static void addTextToAlertField(String data)
	{
		alert.sendKeys(data);
	}
	
	public static String getTextDataOfAlert()
	{ 
		String Content=alert.getText();
		return Content;
		
	}
}
