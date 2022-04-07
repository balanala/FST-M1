@activity1
Feature: First Test

  @SmokeTest
  Scenario: Opening a webpage using Selenium
    Given User is on the Google Home Page
    When User types in Cheese and hits ENTER
    Then Show how many search results were displayed
    And Close the Browser
