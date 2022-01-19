package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.SearchPage;
import pages.SearchResultPage;
import testBase.testBase;



public class searchSteps extends testBase{
SearchPage search;	
SearchResultPage searchResult;	
CartPage cartpage;



@When("I search for the given product")
public void i_search_for_product() {
	search=new SearchPage(driver);

	search.enterSearchProduct(property.getProperty("productToSearch"));
	
}

@Then("the product list appears for searched product")
public void the_product_list_appears_for_searched_product() {
   
}

@Then("Select the product and add to cart")
public void Select_the_product() throws Throwable {
	searchResult=new SearchResultPage(driver);
	searchResult.selectProduct();
	switchtoOtherWindow();
    searchResult.addToCart();
	
 }

@Then("Go to cart and verify the product")
public void Go_to_cart_and_verify_to_product() {
	cartpage=new CartPage(driver);
	cartpage.cartButton();
	cartpage.proceedToBuyButton();
	
}

//@Then("Sign in to proceed to buy")
//public void Signin_to_proceed_to_buy() {
//	cartpage=new CartPage(driver);
//	cartpage.signin(property.getProperty("username"),property.getProperty("password"));
//		
// }
}
