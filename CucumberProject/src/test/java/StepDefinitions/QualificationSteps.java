package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.QualificationPage;
import pages.loginPage;
import testBase.Base;


public class QualificationSteps extends Base {
	
	
	QualificationPage qualification;
	loginPage login;
	
	
	@Given("^Browser is opened for user$")
	public void Browser_is_opened_for_user() {
	Base.setup();
	}

	@When("^User logs in$")
	public void user_logs_in() throws Throwable{
		login=new loginPage(driver);
		login.login(property.getProperty("username"),property.getProperty("password"));
	}
	 
	
	@And("^Home page comes up$")
     public void Home_page_comes_up(){
     
    	System.out.println(login.verifyTitle());
        
    	
	}
	
	@When("^User clicks on Admin tab$")
	public void user_clicks_on_admin_tab() throws Exception {
		Thread.sleep(3000);
		qualification=new QualificationPage(driver);
		qualification.clickAdmin();
		
	}

	@When("^User clicks on Qualification tab$")
	public void user_clicks_on_qualification_tab() {
		
		qualification.clickQualifications();
		
	}

	@When("^User clicks on Skills element$")
	public void user_clicks_on_skills_element() {
		qualification.clickSkills();
		
	}

	
	@When("^User clicks on Add button$")
	public void user_clicks_on_add_button() {
		qualification.clickAddButton();
	}

	
	@When("^User enter new skills$")
	public void user_enter_new_skills() {

		qualification.enterSkillName(property.getProperty("skillname"));
		
	}

	@When("^User clicks on Save button$")
	public void user_clicks_on_save_button() {
		qualification.clickSaveButton();
	}

    @Then("^User logout$")	
    public void user_logout() throws Exception
    {
    	login.logout();
    }
    
    @And("^User closes the Browser$")
    public void CloseBrowser() {
    Base.closeBrowser();	
    	
    }
}


