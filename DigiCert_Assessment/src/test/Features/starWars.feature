Feature: Sort movies
  Background:
    Given User launches the Chrome browser
    When User opens URL "http://localhost:3000/"

  Scenario: Sort movies by Title
    And Sort the movies column
    And Verify that last movie in the list is "The Phantom Menace"


  Scenario: View the movie
    Then User clicks on "The Empire Strikes Back" movie
    And Verifies the species list has "Wookie"


  Scenario: Planets Verification
    Then Click on movie "The Phantom Menace"
    Then Verify that Planets "Camino" is not part of the movie




