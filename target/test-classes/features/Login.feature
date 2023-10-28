#Author: your.email@your.domain.com
@tag
Feature: Login

  @tag1
  Scenario: As a tester I open facebook application to
    enter my valid user name and password and I click login button
    so that I can be logged in

    Given I open facebook application
    When I enter my valid user name
    And I enter my valid password
    And I click login button
    Then I can be logged in
