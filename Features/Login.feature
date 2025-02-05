Feature: login

#In Cucumber, the Background keyword is used to define common steps that should run before every scenario in a feature file.
 Background: Common steps for all scenarios
 	Given User launch the chrome browser
 	When User open URL "https://admin-demo.nopcommerce.com/login" 

Scenario: Successfull login with valid credentials
		Then User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on login
		Then Page title should be "DashBoard / nopCommerce administration"
		Then User click on logout link
		Then Page title should be "Your Store. Login"
		And close browser

Scenario Outline: Login Data Driven
		Then User enters Email as "<email>" and Password as "<password>"
		And Click on login
		Then Page title should be "DashBoard / nopCommerce administration"
		Then User click on logout link
		Then Page title should be "Your Store. Login"
		And close browser
		
		Examples:
		| email | password |
		| admin@yourstore.com | admin |
		| admin1@yourstore.com | admin123 |