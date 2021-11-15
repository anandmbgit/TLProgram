package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import testBase.Base;

public class loginPage extends Base {
	
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement txt_Password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(id="welcome")
	WebElement Welcome;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;
	
	WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
    public void enterPassword(String pwd) {
		txt_Password.sendKeys(pwd);
	}


	public void enterusername(String uname){
	Username.sendKeys(uname);
	}
	
	public HomePage login(String un,String pwd) {
		Username.sendKeys(un);
		txt_Password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}

	
    public void Login() {
		loginButton.click();
	}
    
     public String verifyTitle() {
		return driver.getTitle();
		
	}
     public void logout() throws Exception {
    	 Welcome.click();
    	// Thread.sleep(2000);
    	// Logout.click();
    	 clickButton(Logout);
     }
    	 
     public void clickButton(WebElement ele) {
     
    	 WebDriverWait wait=new WebDriverWait(driver,20);
    	 wait.until(ExpectedConditions.elementToBeClickable(ele));
    	 ele.click();
    	 
    	 
     }
     @And("^Close the Browser$")
     public void Close_Broser() {
     Base.closeBrowser();	
     	
     }
     
}
