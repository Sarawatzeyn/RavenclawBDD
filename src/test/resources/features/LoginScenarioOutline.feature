@scenarioOutline @common
Feature: Login feature with out line
  I want to use this template for my feature file

  @tag1
  Scenario Outline: As a user I open facebook application to
    enter my valid user name and password and I click login button
    for multiple users so that users can be logged in with their credentials

    Given user enter <browser> and <Url> to open application
    When user enter <userName> and <password> on the input field
    And user click on the login button
    Then user close the application

    Examples: 
      | browser  | Url                         | userName  | password |
      | "Chrome" | "https://www.facebook.com/" | "sarawat" | "kkk"    |
      | "Chrome" | "https://www.facebook.com/" | "bushra" | "mmm"    |
