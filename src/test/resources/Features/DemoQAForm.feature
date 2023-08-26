Feature: Form 
Scenario: Successful Form Submit Functionality
	Given User Launch Chrome browser 
	When User opens URL "https://demoqa.com/" 
	When User click on Forms Menu
	And User click on Practice Form Under Form Menu
	Then Page heading should be "Student Registration Form" 
	When User fill Student Registration Form and click on Submit Button
	Then User can see message "Thanks for submitting the form"
	And close browser 