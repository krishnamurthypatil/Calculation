@SDETCucumberAssignments1
Feature: Registration and login is successful
  I want to use this template for my feature file

  
 
  @ErrorMessage
  Scenario: Click Start Over button
    Given User launch the gillette "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" website
    Then User Fills "Single" "0" "live" "0" "0" "1" "0" "0" "0" "0" the details
    Then Check Error Message