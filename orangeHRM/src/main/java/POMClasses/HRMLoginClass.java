package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginClass {

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	private WebElement login;

	public HRMLoginClass(WebDriver driver1) // Constructor driver1 = driver = new ChromeDriver()
	{
		PageFactory.initElements(driver1, this); // Always Same in Each Class
	}

	public void sendUserName() {
		userName.sendKeys("Admin");
	}

	public void sendPassword() {
		password.sendKeys("admin123");
	}

	public void clickOnLogin() {
		login.click();
	}

//	OR

	public void loginOrangeHRM() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
	}

}
