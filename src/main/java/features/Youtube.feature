@TestYoutubePage
Feature: YoutubeSearch
  Scenario: Search Test
    When I open page "https://www.youtube.com/"
    And Enter keys "Ukarain" in search field
    Then Get first link of list

