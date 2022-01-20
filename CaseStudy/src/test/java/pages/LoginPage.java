package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import testBase.testBase;

public class LoginPage extends testBase {

	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement username;   
	
	@FindBy(id="continue")
    WebElement continueButton;  
	
	@FindBy(id="ap_password")
    WebElement password;   
	
	@FindBy(id="signInSubmit")
	WebElement SignInButton;
    

	//WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
		
	

	public void signinButton() {
    	clickButton(signin);
      }
    	 
	
    public SearchPage login(String uname,String pwd) {

		enterText(username,uname);
		clickButton(continueButton);
    	enterText(password,pwd);
		clickButton(SignInButton);
    	return PageFactory.initElements(driver, SearchPage.class);
	 }


   }
    
     	
     
     
