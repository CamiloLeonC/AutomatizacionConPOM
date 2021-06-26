Feature: Register Form

  @regression
  Scenario: Register successful
    Given That a web user i want to register in the form
    When fill all the requested fields in the form
    Then we can see the form with our information