@regression
Feature: Boat Quote Validation

  Scenario: Boat quote test
    Given user navigate to homepage
    Then user click on product element
    And user select boat
    And user input zipcode
    When click start quote
    Then user will be in about you page
    And title of the page will be <Information About You>

   @smoke 
    Scenario: Boat quote test 2
    Given user navigate to homepage
    Then user click on product element
    And user select boat
    And user input zipcode
    When click start quote
    Then user will be in about you page
    And title of the page will be <Information About You>
    