package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	
	@FindBy (xpath ="(//span[contains(text(),'Hello')])[2]")
	private WebElement sign_in;
	
	@FindBy (xpath ="//input[@id='ap_email']")
	private WebElement email_mobile;
	
	@FindBy (xpath ="//input[@id='continue']")
	private WebElement continew;
	
	@FindBy (xpath ="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy (xpath ="//input[contains(@id,'sign')]")
	private WebElement log_in;
	
	public AmazonLogin(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void signIN()
	{
		sign_in.click();
	}
	public void emailMobile()
	{
		email_mobile.sendKeys("8446478848");
	}
	public void continew()
	{
		continew.click();
	}
	public void password()
	{
		password.sendKeys("201194@Psagar");
	}
	public void logIN()
	{
		log_in.click();
	}
	
}
