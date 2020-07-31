package com.smart.qa.testutility;

import java.util.Iterator;
import java.util.Set;

import com.smart.qa.base.TestBaseClass;

public class BrowserWindowHandling extends TestBaseClass{
	
	public static void browserWindowHandle() {
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> windowHandle=driver.getWindowHandles();
		
		Iterator<String> itwnd=windowHandle.iterator();
		 while(itwnd.hasNext())
		 {
			 String childWindow=itwnd.next();
			if(!parentWindow.equals(childWindow)) {
				driver.close();
			} 
				
		 }
		
		 driver.switchTo().window(parentWindow);
	}

}
