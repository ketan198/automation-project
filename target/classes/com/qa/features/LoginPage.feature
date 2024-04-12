Feature: Sauce Lab Feature 

Scenario Outline: Sauce lab login feature 

		Given user is on the login page
		When title of login page is swag labs
    Then user enter "<username>" and "<password>" 	
    Then user is on homepage
   	Then user says print

   	
   	Examples:
			| username      | password     |
			| standard_user | secret_sauce |
			| visual_user   | exsecret_saucee |   