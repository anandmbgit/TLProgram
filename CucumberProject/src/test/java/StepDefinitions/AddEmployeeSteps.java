package StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddEmployeePage;
import pages.QualificationPage;
import pages.loginPage;
import testBase.Base;


public class AddEmployeeSteps extends Base {
	
	loginPage login;
	AddEmployeePage addEmp;
	
	@Given("^Browser is open for user$")
	public void Browser_is_open_for_user() {
	Base.setup();
	}

	@When("^User logs into application$")
	public void user_logs_in() throws Throwable{
		login=new loginPage(driver);
		login.login(property.getProperty("username"),property.getProperty("password"));
	}
	 
	@When("^User clicks on PIM menu item$")
	public void User_clicks_on_PIM_menu_item() throws Throwable {
		Thread.sleep(3000);
		addEmp=new AddEmployeePage(driver);
		addEmp.clickPIMMenu();
	}
	
	@When("^User clicks on Add Employee tab$")
	public void User_clicks_on_Add_Employee_tab() {
		addEmp.AddEmployeeMenu();
	}
	@Then("^User enters firstname$")
	public void User_enters_firstname() {
		addEmp=new AddEmployeePage(driver);
		addEmp.enterFirstName(property.getProperty("EmployeeFirstName"));
	}
	
	@Then("^User enters middlename$")
	public void User_enters_middlename() {
		addEmp=new AddEmployeePage(driver);
		addEmp.enterFirstName(property.getProperty("EmployeeMiddleName"));
	}
	
	@Then("^User enters lastname$")
	public void User_enters_lastname() {
		addEmp=new AddEmployeePage(driver);
		addEmp.enterFirstName(property.getProperty("EmployeeLastName"));
	}
	
	@Then("^User Save the record$")
	public void User_Save_then_record() {
		
		addEmp.saveButton();
	}
	
    @Then("^User logsout of application$")	
    public void logout() throws Exception
    {
    	login.logout();
    }
    
    @And("^User closes the browser$")
    public void User_closes_the_browser() {
    Base.closeBrowser();	
    	
    }
}


