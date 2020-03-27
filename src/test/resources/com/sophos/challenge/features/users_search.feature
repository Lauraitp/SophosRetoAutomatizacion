Feature: Search planets
  As integrator I want to be able to 

Scenario: Each user has a name
	Given I go to the page rest
  When I ask for the user id 446
  Then I should see that the first name is Wilburn