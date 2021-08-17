@SDETCucumberAssignments1
Feature: Registration and login is successful
  I want to use this template for my feature file

  @Registration
  Scenario: Registration to ANZ Site
    Given User launch the gillette "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" website
    Then User Fills "Single" "0" "live" "100" "10" "10" "0" "100" "0" "0" the details

  @Reset
  Scenario: Click Start Over button
    Given User launch the gillette "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" website
    Then User Fills "Single" "0" "live" "80000" "10000" "500" "0" "100" "0" "10000" the details
    Then Click on Start Over
 
  @ErrorMessage
  Scenario: Click Start Over button
    Given User launch the gillette "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" website
    Then User Fills "Single" "0" "live" "0" "0" "1" "0" "0" "0" "0" the details
    Then Check Error Message
