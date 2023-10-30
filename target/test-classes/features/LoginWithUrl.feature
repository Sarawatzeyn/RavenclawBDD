@sprint3 @common
Feature: As a tester I open facebook application to
    enter my valid user name and password and I click login button
    so that I can be logged in with my credentials


  Scenario: Login test with user input
    Given user open "Edge" and "https://www.facebook.com/"
    When user enter username "sarawat"
    And user enter password "jjk"
    And user click on login button
    Then user logged in facebook

   
  Scenario: Login test with user input
    Given user open "Edge" and "https://www.facebook.com/"
    When user enter username "mashaba"
    And user enter password "jjk"
    And user click on login button
    Then user logged in facebook
    
   
  Scenario: Login test with user input
    Given user open "Edge" and "https://www.facebook.com/"
    When user enter username "bushra"
    And user enter password "jjk"
    And user click on login button
    Then user logged in facebook
    