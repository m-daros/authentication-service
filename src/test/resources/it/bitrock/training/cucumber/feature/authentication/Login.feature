Feature: Login

  As a user I want to login into my application so I can access restricted areas and functionalities

  Scenario Outline: The user can login only providing valid credentials

    I will be able to login into the application only providing my right credentials: username and password

    Given my username is "<registered-username>"
    And   my password is "<registered-password>"

    When  I login with username "<provided-username>" and password "<provided-password>"

    Then  the application says "<answer>"

  Examples:

    | registered-username    | registered-password   | provided-username    | provided-password   | answer          |
    | pippo                  | pippo-pwd             | pippo                | pippo-pwd           | Logged          |
    | pippo                  | pippo-pwd             | pippo                | pippo-wrong-pwd     | Unable to login |
    | pippo                  | pippo-pwd             | pluto                | pippo-pwd           | Unable to login |
    | pluto                  | pluto-pwd             | pluto                | pluto-pwd           | Logged          |
