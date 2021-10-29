package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMobile {
	
	@FindBy (xpath ="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy (xpath ="//span[text()=' galaxy m31']")
	private WebElement samsunggalaxym31;
	
	public SearchMobile(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void search()
	{
		search.sendKeys("Samsung");
	}
	public void samsungGalaxyM31()
	{
		samsunggalaxym31.click();
	}

}
