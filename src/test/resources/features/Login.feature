@Login
Feature: Login
User want to login to website sauce demo

#  @TC1
#Scenario: user login with valid credential
#  Given User already on login page
#  When User input "standard_user" as username
#  And User input "secret_sauce" as password
#  And User click button login
#    Then User already on inventory page

  @TC2
  Scenario: user login with valid credential and do select click product
    Given User already on login page
    When User input "standard_user" as userName and "secret_sauce" as password
    Then User already on inventory page
    When User sort product by "Price (low to high)"
    And User click product "Sauce Labs Bike Light"
    And User click product "Sauce Labs Onesie"


#  @TC3
#  Scenario Outline: user login with invalid credential
#    Given User already on login page
#    When User input "<username>" as userName and "<password>" as password
#    Then User see "<errorMessage>" as error message
#Examples:
#    | username      | password      | errorMessage                                                               |
#    | standard_user |               | Epic sadface: Password is required                                         |
#    |               | secret_sauce  | Epic sadface: Username is requireds                                        |
#    |               |               | Epic sadface: Username is requireds                                        |
#    | ziko          | rapi          | Epic sadface: Username and password do not match any user in this service  |

