package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Sagar\\Velocity\\Software Testing\\Class Lecture Video\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver openFirefoxBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"D:\\Sagar\\Velocity\\Software Testing\\Class Lecture Video\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
