Feature: Login

  As a user I want to login into my application so I can access restricted areas and functionalities

  Scenario: Succesful login

    I will be able to login into the application providing my credentials: username and password

    Given my username is "pippo"
    And   my password is "pippo-pwd"

    When  I login with username "pippo"
    And   password "pippo-pwd"

    Then  the application says "Logged"