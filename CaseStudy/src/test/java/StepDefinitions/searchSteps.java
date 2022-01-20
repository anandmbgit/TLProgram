package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.SearchPage;
import testBase.testBase;



public class searchSteps extends testBase{

SearchPage search=new SearchPage(driver);
CartPage cartpage=new CartPage(driver);

@When("I search for the given product")
public void i_search_for_product() {
	search.enterSearchProduct(property.getProperty("productToSearch"));
}

@Then("the product is displayed on the screen if it is available")
public void the_product_list_appears_for_searched_product() {
 search.isProductAvailable();
	
}

@Then("select the product with quantity and add to cart")
public void Select_the_product() throws Throwable {
	search.selectProduct();
	switchtoOtherWindow();
	cartpage.selectQuantity(property.getProperty("quantity"));
	search.addToCart();
	
 }

@Then("Go to cart and verify the product")
public void Go_to_cart_and_verify_to_product() throws Exception {
	cartpage.cartButton();
	cartpage.proceedToBuyButton();
	cartpage.deliverToThisAddressButton();
	//cartpage.selectCashOnDelivery();
     }

}