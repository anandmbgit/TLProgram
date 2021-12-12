@Search
Feature: Amazon search functionality
 
  Scenario:  Search for given product
    Given Browser opened
    When I search for the given product
    Then the product list appears for searched product
    Then Select the product and add to cart
    Then Go to cart and verify the product
    Then Sign in to proceed to buy
       
