Feature: I want successfully login to dashboard
  
  Scenario: Login using valid credentials
    Given I am the login page
    When I fill valid user name
    And I click continue button
    And I fill valid password
    And I click login button
    Then I successfully login to dashboard