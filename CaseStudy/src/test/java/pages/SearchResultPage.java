package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.testBase;

public class SearchResultPage extends testBase{

	@FindBy(linkText="boAt Bassheads 900 Wired On Ear Headphones with Mic (Carbon Black)")
	WebElement productName;
	
	@FindBy(name="submit.add-to-cart")
	WebElement addToCart;
	
	
	
	//WebDriver driver;
	public SearchResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public ProductSelectionPage selectProduct() {
		productName.click();
		return new ProductSelectionPage(driver);
		
	}
	
	
	
	public CartPage addToCart() {
		clickButton(addToCart);
		return new CartPage(driver);
		
	}
	

	
}
