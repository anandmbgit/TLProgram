package pages;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import testBase.testBase;

public class SearchPage extends testBase {
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement mainsearch;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchSubmit;
	
	@FindBy(linkText="boAt Bassheads 900 Wired On Ear Headphones with Mic (Carbon Black)")
	WebElement productName;
	
	@FindBy(name="submit.add-to-cart")
	WebElement addToCart;
	
	
	//WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterSearchProduct(String product) {
    	
    	enterText(mainsearch,product);
    	clickButton(searchSubmit);
    }
    
	

	public boolean isProductAvailable() {

		try {
			productName.isDisplayed();
			return true;
	  } catch (NoSuchElementException e) {
			return false;
		}
 	}

	public void selectProduct() {
		productName.click();
		
	}
	
	public CartPage addToCart() {
		clickButton(addToCart);
		return new CartPage(driver);
		
	}
 }
