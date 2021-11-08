package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class AddEmployeePage extends Base{

	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement AddEmployee;
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(id="middleName")
	WebElement middleName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	WebDriver driver;
	public AddEmployeePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickPIMMenu() {
		PIM.click();
	}
	
	public void AddEmployeeMenu() {
		AddEmployee.click();
	}
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	public void enterMiddleName(String mname) {
		firstName.sendKeys(mname);
	}
	public void enterLast(String lname) {
		firstName.sendKeys(lname);
	}
	
	public void saveButton() {
		
		btnSave.click();
	}
}
