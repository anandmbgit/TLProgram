package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.testBase;

public class CartPage extends testBase {

	@FindBy(xpath="//a[@id='hlb-view-cart-announce']")
	WebElement cartButton;

	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement cart;
	
    @FindBy(name="proceedToRetailCheckout")
	WebElement proceedToBuy;	
	
	@FindBy(xpath="//span[@class='a-truncate-cut']")
    WebElement selectedProduct;   
	
	@FindBy(id="ap_email")
    WebElement username;   
	
	@FindBy(id="continue")
    WebElement continueButton;  
	
	@FindBy(id="ap_password")
    WebElement password;   
	@FindBy(id="signInSubmit")
	WebElement SignInButton;
    
	//WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public void cartButton() {
			cart.click();
					
	}
		
		public void proceedToBuyButton() {
			proceedToBuy.click();
		}
		
	
			
		}

