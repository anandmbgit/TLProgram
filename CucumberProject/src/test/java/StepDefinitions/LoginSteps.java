package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;
import testBase.Base;



public class LoginSteps extends Base{
	
	
	loginPage login;
	
	
	@Given("^Browser is open$")
	public void user_is_on_login_page() {
	Base.setup();
	}

	@When("^User enters username & password and login$")
	public void user_enters_username() throws Throwable{
		login=new loginPage(driver);
		login.login(property.getProperty("username"),property.getProperty("password"));
	}
	 
	
	@And("^Home page is displayed$")
     public void Home_page_is_displayed(){
     
    	System.out.println(login.verifyTitle());
        
    	
	}

	@Then("^User logsout$")
	public void User_Logsout() throws Exception {
		//login.clickButton(logout);
		login.logout();
	}
	
	
	 @And("^Close the browser$")
	    public void Close_Browser() {
	    Base.closeBrowser();	
	    	
	    }
}
