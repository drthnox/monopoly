Feature: Play game with 2 AI

  Background:
    Given the game is ready to play with 2 AI

  Scenario Outline: Model the player movement around the board
    Given player 1 is at <LOCATION>
    When player 1 takes their turn
    And player 1 rolls a <DICE_ROLL>
    Then player 1's new position is <NEW_LOCATION>

    Examples:
      | LOCATION | DICE_ROLL | NEW_LOCATION |
      | 1        | 10        | 11           |
      | 35       | 10        | 5            |


