@Cart
Feature: Cart
  User want to cart to website sauce demo

  @TC1
  Scenario: user login with valid credential and do select click shopping cart
    Given User already on login page
    When User input "standard_user" as userName and "secret_sauce" as password
    Then User already on inventory page
    When User sort product by "Price (low to high)"
    And User click product "Sauce Labs Bike Light"
    And User click product "Sauce Labs Onesie"
    And User click shopping cart
    And User click button remove "Sauce Labs Bike Light"
    And User click button checkout
    And User input "andreas" as firstName and "firdaus" as lastName and "IND2023" as postalCode
    Then User see "Total: $8.63" as total price
    When User click button finish