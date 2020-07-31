package com.smart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.smart.qa.testutility.BasicTestUtility;
import com.smart.qa.testutility.WebDriverEventHandler;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	public static WebDriverEventHandler eventListener;

	public ExtentReports extent;
	public ExtentTest logger;

	/*
	 * base class constructor is created :To initialize the properties object to
	 * fetch config(env)variables from config.properties file
	 */

	public TestBaseClass() {
		prop = new Properties();
		try {
			FileInputStream Fileinput = new FileInputStream("Data");
			prop.load(Fileinput);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Browser/Chrome/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "./Browser/Geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebDriverEventHandler();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(BasicTestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(BasicTestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	@BeforeTest
	public void setExtent() {
    extent=new ExtentReports( );
    extent.setSystemInfo("Host Name", "Pooja vithal");
	extent.setSystemInfo("User Name", "Smart Automation");
	extent.setSystemInfo("Environment", "QA");
	}

	@AfterTest
	public void endReport() {
		extent.flush();
		//extent.close();
	}

}
