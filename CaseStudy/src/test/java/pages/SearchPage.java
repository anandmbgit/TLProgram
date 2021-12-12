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

public class SearchPage extends testBase {
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement mainsearch;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchSubmit;
	
	
	
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
    public SearchResultPage enterSearchProduct(String product) {
    	
    	mainsearch.sendKeys(product);
    	clickButton(searchSubmit);
    	return PageFactory.initElements(driver, SearchResultPage.class);
	}

    
    	 
    	 
     }
    
     	
     
     
