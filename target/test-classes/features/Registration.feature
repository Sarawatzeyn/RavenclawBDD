@Registration
Feature: Registration test
  
  Scenario Outline: As a tester I open facebook application to create new account
    enter my valid user firstname and lastname
    Enter valid email id and confirm email
    create valid password
    enter valid date of birth
    enter gender 
    click signup button
    so that i can create an account

    Given Open <browser> and put <url>
    When Click on registration button
    And In put first Name <enterFirstName>
    And Input last Name <enterLastName>
    And Input email <enterEmail>
    And Input re enter email <enterconfirmEmail>
    And Input password <enterYourPassword>
    And Input birth Month <enterYourBirthMonth>
    And Input birth Day <enterYourBirthDay>
    And Input birth Year <enterYourBirthYear>
    And Input gender <enterYourgender>
    And click login button
    Then I can create an account

    Examples: 
      | browser  | url                         | enterFirstName | enterLastName | enterEmail     | enterconfirmEmail | enterYourPassword | enterYourBirthMonth | enterYourBirthDay | enterYourBirthYear | enterYourgender |
      | "chrome" | "https://www.facebook.com/" | "Sarawat"      | "Rahman"      | "SR@gmail.com" | "SR@gmail.com"    | "sr123sumon12311" | "Dec"               | "21"              | "1999"             | "Female"        |
