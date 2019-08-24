package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;


public class TestBase {

	public static WebDriver driver;
	
	//Initializing properties to load in parent and child classes
	public static Properties prop;
	static Logger log = Logger.getLogger(TestBase.class);

	public TestBase() {
		
		try {
			prop= new Properties();
			FileInputStream ip= new FileInputStream("\\Users\\AC37118\\Downloads\\Backup\\LearningSpace\\FreeCRMTest\\"
					+ "src\\main\\java\\com\\crm\\qa\\config\\config.properties") ;
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		log.info("BaseClass entering application URL");
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\\Users\\AC37118\\Downloads\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS );
		driver.get(prop.getProperty("url"));
	}
	

}
