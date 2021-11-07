package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class HomePage extends Base{

	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement Leave;
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement Time;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement Recruitment;
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement MyInfo;
	
	@FindBy(id="menu__Performance")
	WebElement Performance;
	
	@FindBy(id="menu_dashboard_index")
	WebElement Dashboard;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonAdminMenu() {
		Admin.click();
	}
	
	
}
