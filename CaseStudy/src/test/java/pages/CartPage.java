package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    
	
	@FindBy(id="quantity")
	WebElement quantity;
	
	@FindBy(xpath="//span[@id='nav-cart-count']	")
	WebElement cartCount;
	
	
	@FindAll(@FindBy(how = How.XPATH, using = "//span[@class='a-button-text a-declarative']"))
	List<WebElement> listofquantity;
	
	
	@FindBy(xpath="//div[contains(@class,'ship-to-this-address a-button a-button-primary a-button-span12 a-spacing-medium')]//a[contains(@class,'a-declarative a-button-text')]")
	WebElement addressButton;
	
	@FindBy(xpath="//input[@id='pp-MKzOmb-115']")
	WebElement cashOnDelivery;
	
	//WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public void cartButton() {
			clickButton(cart);
	}
		
		public void selectQuantity(String value) {
	    	quantity.click();
			select(quantity,value);
		}
	
		public void proceedToBuyButton() {
			clickButton(proceedToBuy);
			//return PageFactory.initElements(driver, PaymentPage.class);
			//return new PaymentPage(driver);
		}
	
		public void deliverToThisAddressButton() {
			clickButton(addressButton);
	}
		
		public void selectCashOnDelivery() {
			
			select_RadioButton(cashOnDelivery);
		}
  }

			
	

