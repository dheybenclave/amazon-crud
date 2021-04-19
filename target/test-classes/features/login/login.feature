Feature: Login to Amazon 


Scenario: Login to Amazaon Website 
	Given user in the home page 
	When user enter "dheyserenitybdd@gmail.com" as username and enter "config.serenitybdd" as password 
	Then user should able to login 
	
	
	#   gmail : dheyserenitybdd@gmail.com
	#   password : config.serenitybdd
	
	#   amazon : dheyserenitybdd@gmail.com
	#   password : config.serenitybdd
	
	#REST API
#	http://api.openweathermap.org/data/2.5/weather?lat=14.6615&lon=120.9432&appid=c7d778d1ee4dba65a8d3d8bdf2c89bdb
#	lat=14.6615ded
#	lon=120.9432
#	appid=c7d778d1ee4dba65a8d3d8bdf2c89bdb
	
	
	
	