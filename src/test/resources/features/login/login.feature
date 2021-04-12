Feature: Login to Amazon 


Scenario: Login to Amazaon Website 
	Given user in the home page 
	When user enter "dheyserenitybdd@gmail.com" as username and enter "config.serenitybdd" as password 
	Then user should able to login 
	
	
	#   gmail : dheyserenitybdd@gmail.com
	#   password : config.serenitybdd
	
	#   amazon : dheyserenitybdd@gmail.com
	#   password : config.serenitybdd