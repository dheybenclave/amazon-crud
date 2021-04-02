Feature: Login to Amazon


  Scenario: Login with valid credentials
  # Try to change one of the values below to provoke a failure
    Given user is on the home page
    When user enter "Admin" as username and enter "admind123" as password
    Then user should able to login
