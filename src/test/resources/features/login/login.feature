Feature: Login to Amazon


  Scenario: Login to Amazaon Website
    Given user in the home page
    When user enter "admin" as username and enter "admin" as password
    Then user should able to login

    
    
  Scenario: Login to Amazaon Website 2
    Given user in the home page
    When user enter "sample" as username and enter "asdsada" as password
    Then user should able to login
    
    
      Scenario: Login to Amazaon Website 3
    Given user in the home page
    When user enter "hehe" as username and enter "hee" as password
    Then user should able to login
    