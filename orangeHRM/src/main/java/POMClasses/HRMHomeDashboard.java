package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMHomeDashboard {

	@FindBy(xpath = "//span[text()='Assign Leave']")
	private WebElement assignLeave;

	@FindBy(xpath = "//span[text()='Leave List']")
	private WebElement leaveList;

	@FindBy(xpath = "//span[text()='Timesheets']")
	private WebElement timesheets;

	@FindBy(xpath = "//span[text()='Apply Leave']")
	private WebElement applyLeave;

	@FindBy(xpath = "//span[text()='My Leave']")
	private WebElement myLeave;

	@FindBy(xpath = "//span[text()='My Timesheet']")
	private WebElement myTimeSheet;

	public HRMHomeDashboard(WebDriver driver1) // Constructor
	{
		PageFactory.initElements(driver1, this); // Always Same in Every POM Class
	}

	public void openAssignLeave() {
		assignLeave.click();
	}

	public void openLeaveList() {
		leaveList.click();
	}

	public void openTimesheets() {
		timesheets.click();
	}

	public void openApplyLeave() {
		applyLeave.click();
	}

	public void openmMyLeave() {
		myLeave.click();
	}

	public void openMyTimeSheet() {
		myTimeSheet.click();
	}

}
