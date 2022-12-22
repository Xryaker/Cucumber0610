@AllTest
@OUTLINE
Feature: hillel test certificate page

  Scenario Outline:
    When I open page "https://certificate.ithillel.ua/"
    And Sent certificate number "<table>"
    And Check massage "<kolu2>"
    Then Print text massage
    Examples:
      | table         | kolu2                  |
      | kjbkjbsksjdbs | Сертифікат не знайдено |
      | sldjnsljcndsl | lj kj                  |
      | lwjsrndlksndf | l kj lk                |
      | skfjbskjfb    | Сертифікат не знайдено |
      | ksljdvsljknd  | ll lk                  |
      | ksjfdnvlsjknd | Сертифікат не знайдено |