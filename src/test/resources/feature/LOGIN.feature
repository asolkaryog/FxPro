Feature: varify the functionality of login btn of Actitime

  Scenario: To varify the user is on homepage
    Given Open the browser
    And user have to enter the url of application
    When user enter valid username and pwd
    And click on login btn
    Then user navigate to homepage
