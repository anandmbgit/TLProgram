@Search
Feature: Amazon search functionality
 
  Scenario:  Search and select the required product
     
    When I search for the given product
    Then the product is displayed on the screen if it is available 
    Then select the product with quantity and add to cart
    Then Go to cart and verify the product
   
       
