package TestClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePackage.Base;
import POMClasses.HRMHomeDashboard;
import POMClasses.HRMLoginClass;
import POMClasses.HRMTimesheet;
import UtilityPackage.Take;

public class TestClass extends Base {

	private WebDriver driver;
	private HRMLoginClass loginclass;
	private HRMHomeDashboard dashboard;
	private HRMTimesheet timesheet;

	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser) {
		System.out.println(browser);

		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = openChromeBrowser();
		}
		else
		{
			driver = openFirefoxBrowser();
		}
		
	}
	
	@BeforeClass
	public void launchBrowser(){

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@BeforeMethod
	public void BeforeTest() {
		
		loginclass = new HRMLoginClass(driver);
		dashboard = new HRMHomeDashboard(driver);
		timesheet = new HRMTimesheet(driver);
	}

	@Test
	public void testA() throws IOException, InterruptedException {
		loginclass.sendUserName();
		loginclass.sendPassword();
		loginclass.clickOnLogin();
		Thread.sleep(3000);
		Take.screenshot(driver);
		Thread.sleep(3000);
	}

	@Test
	public void testB() throws IOException, InterruptedException {
		SoftAssert soft = new SoftAssert();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		soft.assertEquals(url,"https:");
		System.out.println("Assert Not Pass");
		soft.assertAll();
		dashboard.openTimesheets();
		Take.screenshot(driver);
		
	}

	@Test 
	public void testC() throws IOException, InterruptedException {
		String tital = driver.getTitle();
		System.out.println(tital);
		Assert.assertEquals(tital, "OrangeHRM");
		System.out.println("Tital Match");
		
		timesheet.clickSerach();
		timesheet.serachEmpName();
		timesheet.selectEmp();
		timesheet.viewTimesheets();
		Take.screenshot(driver);
		Thread.sleep(3000);
		
	}

	@AfterMethod
	public void AfterMethod(){
		
		loginclass = null;
		dashboard = null;
		timesheet = null;
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Test Screept Pass");
		driver.close();
	}
	

}
