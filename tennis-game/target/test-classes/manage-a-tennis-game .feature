Feature: Manage the score of a game

  As a tennis referee, I want to manage the score of a game of a set of a tennis match between 2 players with simple Game rules.
  In order to display the current Game score of each player

  Scenario Outline: Display the current Game score of a player
    Given The game starts with a score of 0 point for the player
    When player1 win <winPointPlayer1> game and player2 win <winPointPlayer2> game
    Then the Game score changes to <score>

    Examples:
      | winPointPlayer1 | winPointPlayer2 | score                   |
      | 0               | 0               | Game: 0 - 0             |
      | 1               | 0               | Game: 15 - 0            |
      | 2               | 0               | Game: 30 - 0            |
      | 3               | 0               | Game: 40 - 0            |
      | 4               | 0               | Game: Player 1 win game |
      | 0               | 1               | Game: 0 - 15            |
      | 0               | 2               | Game: 0 - 30            |
      | 0               | 3               | Game: 0 - 40            |
      | 0               | 4               | Game: Player 2 win game |

  Scenario Outline: Manage the specific of the rule DEUCE at the end of a Game
    Given The game starts with a score of <initialPointPlayer1> point for the player1 and a score of <initialPointPlayer2> point for the player2
    When player1 win <winPointPlayer1> game and player2 win <winPointPlayer2> game
    Then the Game score changes to <score>

    Examples:
      | initialPointPlayer1 | initialPointPlayer2 | winPointPlayer1 | winPointPlayer2 | score                    |
      | 3                   | 3                   | 0               | 0               | Game: DEUCE              |
      | 3                   | 3                   | 1               | 0               | Game: Advantage player 1 |
      | 3                   | 3                   | 0               | 1               | Game: Advantage player 2 |
      | 4                   | 3                   | 1               | 0               | Game: Player 1 win game  |
      | 3                   | 4                   | 0               | 1               | Game: Player 2 win game  |
      | 4                   | 3                   | 0               | 1               | Game: DEUCE              |
      | 3                   | 4                   | 1               | 0               | Game: DEUCE              |


