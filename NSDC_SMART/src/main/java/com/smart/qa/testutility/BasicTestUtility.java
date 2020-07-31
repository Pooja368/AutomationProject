package com.smart.qa.testutility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import com.smart.qa.base.TestBaseClass;

public class BasicTestUtility extends TestBaseClass {

	public static int PAGE_LOAD_TIMEOUT = 20;
	public static int IMPLICIT_WAIT = 10;
	public static Actions action;

	// Switch to frame
	public void switchToFrame() {
		driver.switchTo().frame("mainframe");
	}

	// Take Screenshot
	public static void takeScreenShotAtEndOfTest(String testCaseName) {
		Date d = new Date();
		String dateFormat = d.toString();
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		String CurrentDir = System.getProperty("user.dir");// in the current directory of the project
		try {
			FileHandler.copy(src,
					new File(CurrentDir + "/FailedTestScreenshots" + testCaseName + "_" + dateFormat + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// actions class
	public static void mouseMovementAction(WebElement contact) {
		action = new Actions(driver);
		action.moveToElement(contact).build().perform();
	}

	// Drag and Drop
	public static void dragAndDrop(WebElement drag, WebElement Drop) {

		action.clickAndHold(drag).moveToElement(Drop).release().build().perform();
	}

}
