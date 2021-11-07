package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class QualificationPage extends Base{
	
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminMenu;
	
	@FindBy(id="menu_admin_Qualifications")
	WebElement Qualifications;
	
	@FindBy(id="menu_admin_viewSkills")
	WebElement viewSkills;
	
	@FindBy(id="btnAdd")
	WebElement btnAdd;
	
	@FindBy(id="skill_name")
	WebElement skillName;
	
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	WebDriver driver;	

	public QualificationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	}
	
	
	public void clickAdmin() {
			AdminMenu.click();
	}

    public void clickQualifications() {
		Qualifications.click();
	}

   public void clickSkills() {
	   viewSkills.click();
	}
   public void clickAddButton() {
	   btnAdd.click();
	}
   public void enterSkillName(String skillname) {
	   skillName.sendKeys(skillname);
	}
   public void clickSaveButton() {
	   btnSave.click();
   }
}
