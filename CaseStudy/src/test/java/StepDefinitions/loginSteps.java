package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.LoginPage;
import pages.SearchPage;
import testBase.testBase;

public class loginSteps extends testBase {

	LoginPage loginpage;
	
	@Given("Browser opened")
	public void browser_opened() {
		testBase.setup();
	} 
	
@Then("click on Sign In button")
public void click_on_sign_in_button() {
	loginpage=new LoginPage(driver);
    loginpage.signinButton();
}

@Then("Login with valid credentials")
public void login_with_valid_credentials() {
   
	loginpage=new LoginPage(driver);
	loginpage.login(property.getProperty("username"),property.getProperty("password"));
			
}
	
}
