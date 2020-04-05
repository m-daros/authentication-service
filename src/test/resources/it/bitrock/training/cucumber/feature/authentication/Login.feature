Feature: Login

  As a user I want to login into my application so I can access restricted areas and functionalities

  Scenario: Successfully login

    I will be able to login into the application providing my credentials: username and password

    Given my username is "pippo"
    And   my password is "pippo-pwd"

    When  I login with username "pippo" and password "pippo-pwd"

    Then  the application says "Logged"

  Scenario: Unsuccessfully login

  I will not be able to login into the application providing invalid credentials: username and password

    Given my username is "pippo"
    And   my password is "pippo-pwd"

    When  I login with username "pippo" and password "wrong-pippo-pwd"

    Then  the application says "Not logged"