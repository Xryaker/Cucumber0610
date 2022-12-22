@TestYoutubePage
Feature: YoutubeSearch

  Scenario: Search Test
    When I open page "https://www.youtube.com/"
    And Enter keys "Ukarain" in search field
    Then Get first link of list

  Scenario: Google
    When open browser
    And Some text "kfkfkf"

    Scenario: Example
      When I open page "https://google.com"
      And Enter keys "Ukarain" in search field google