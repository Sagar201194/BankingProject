package TestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.AmazonLogin;
import POMClasses.SearchMobile;
import UtilityPackage.Take;

public class TestClass {

	private WebDriver driver;
	private AmazonLogin amazonlogin;
	private SearchMobile searchmobile;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Sagar\\Velocity\\Software Testing\\Class Lecture Video\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

	}

	@BeforeMethod
	public void beforeMethod() {

		amazonlogin = new AmazonLogin(driver);
		searchmobile = new SearchMobile(driver);
	}

	@Test
	public void testA() throws IOException {
		amazonlogin.signIN();
		amazonlogin.emailMobile();
		amazonlogin.continew();
		amazonlogin.password();
		amazonlogin.logIN();
		Take.screenshot(driver);
	}

	@Test
	public void testB() throws IOException {
		searchmobile.search();
		searchmobile.samsungGalaxyM31();
		Take.screenshot(driver);
	}

	@AfterMethod
	public void afterMethod() {
		amazonlogin = null;
		searchmobile = null;
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Test Screept Pass");
		driver.close();
	}

}
