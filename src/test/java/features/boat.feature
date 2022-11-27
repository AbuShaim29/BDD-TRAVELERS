@boat @regression
Feature: Boat Quote Validation

  Scenario: Boat quote test
    Given user navigate to homepage
    Then user click on product element
    And user select boat
    And user input zipcode
    When click start quote
    Then user will be in about you page
    And title of the page will be <Information About You>

  @steps
  Scenario: boat quote page steps
    When homepage steps done with <"11230">
    Then address page steps done
@data_driven
   Scenario Outline: Data Driven approach for BDD
   When homepage  steps dobe with <"zip">
   Then address page steps done
   Examples: 
   |zip|
   |'11210'|
   |'11230'|
   |'11322'|