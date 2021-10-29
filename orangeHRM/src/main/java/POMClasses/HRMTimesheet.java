package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMTimesheet {

	@FindBy(xpath = "//input[@id='employee']")
	private WebElement clicksearch;

	@FindBy(xpath = "//input[@id='employee']")
	private WebElement empname;

	@FindBy(xpath = "//li[@class='ac_even']")
	private WebElement selectemp;

	@FindBy(xpath = "//input[@id='btnView']")
	private WebElement click_view;

	public HRMTimesheet(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}

	public void clickSerach() {
		clicksearch.click();
	}

	public void serachEmpName() {
		empname.sendKeys("sa");
	}

	public void selectEmp() {
		selectemp.click();
	}

	public void viewTimesheets() {
		click_view.click();
	}

}
