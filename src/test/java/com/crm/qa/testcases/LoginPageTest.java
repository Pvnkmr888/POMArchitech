package com.crm.qa.testcases;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;


public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	Logger log = Logger.getLogger(LoginPageTest.class);
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		log.info("****************************** Starting test cases execution  *****************************************");
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
		initialization();
		 loginpage=new LoginPage();
	}
	
	@Test
	public void loginPageTitle() {
		String title=loginpage.validateLoginPage();
		System.out.println(title);
	//	Assert.assertEquals(title, "");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
