Feature: Manage the score of a set

  As a tennis referee
  I want to manage the score of a set of a tennis match between 2 players
  In order to display the current Game and Set score of each player


  Scenario Outline: Display the current Game and Set score of each player
    Given The game starts with a score of <initialGamePointPlayer1> point for the player1 and a score of <initialGamePointPlayer2> point for the player2
    And The set starts with a score of <initialPointPlayer1> point for the player1 and a score of <initialPointPlayer2> point for the player2
    When player1 win <winPointPlayer1> set or player2 win <winPointPlayer2> set
    Then the set score changes to <score>

    Examples:
      | initialPointPlayer1 | initialPointPlayer2 | initialGamePointPlayer1 | initialGamePointPlayer2 | winPointPlayer1 | winPointPlayer2 | score                    |
      | 0                   | 0                   | 0                       | 0                       | 0               | 0               | Set: 0 - 0 / Game: 0 - 0 |
      | 0                   | 0                   | 0                       | 0                       | 1               | 0               | Set: 1 - 0 / Game: 0 - 0 |
      | 1                   | 0                   | 0                       | 0                       | 1               | 0               | Set: 2 - 0 / Game: 0 - 0 |
      | 2                   | 0                   | 0                       | 0                       | 1               | 0               | Set: 3 - 0 / Game: 0 - 0 |
      | 3                   | 0                   | 0                       | 0                       | 1               | 0               | Set: 4 - 0 / Game: 0 - 0 |
      | 4                   | 0                   | 0                       | 0                       | 1               | 0               | Set: 5 - 0 / Game: 0 - 0 |
      | 5                   | 0                   | 0                       | 0                       | 1               | 0               | Set: Player 1 win set    |

      | 0                   | 0                   | 0                       | 0                       | 0               | 1               | Set: 0 - 1 / Game: 0 - 0 |
      | 0                   | 1                   | 0                       | 0                       | 0               | 1               | Set: 0 - 2 / Game: 0 - 0 |
      | 0                   | 2                   | 0                       | 0                       | 0               | 1               | Set: 0 - 3 / Game: 0 - 0 |
      | 0                   | 3                   | 0                       | 0                       | 0               | 1               | Set: 0 - 4 / Game: 0 - 0 |
      | 0                   | 4                   | 0                       | 0                       | 0               | 1               | Set: 0 - 5 / Game: 0 - 0 |
      | 0                   | 5                   | 0                       | 0                       | 0               | 1               | Set: Player 2 win set    |

      | 5                   | 4                   | 0                       | 0                       | 1               | 0               | Set: Player 1 win set    |
      | 4                   | 5                   | 0                       | 0                       | 0               | 1               | Set: Player 2 win set    |
      | 5                   | 5                   | 0                       | 0                       | 1               | 0               | Set: 6 - 5 / Game: 0 - 0 |
      | 5                   | 5                   | 0                       | 0                       | 0               | 1               | Set: 5 - 6 / Game: 0 - 0 |
      | 6                   | 5                   | 0                       | 0                       | 1               | 0               | Set: Player 1 win set    |
      | 5                   | 6                   | 0                       | 0                       | 0               | 1               | Set: Player 2 win set    |


  Scenario Outline: Display the current Game, Set score and Tie-Break score of each player
    Given The game starts with a score of <initialGamePointPlayer1> point for the player1 and a score of <initialGamePointPlayer2> point for the player2
    And The set starts with a score of <initialPointPlayer1> point for the player1 and a score of <initialPointPlayer2> point for the player2
    When player1 win <winPointPlayer1> set or player2 win <winPointPlayer2> set
    Then the set score changes to <score>

    Examples:
      | initialPointPlayer1 | initialPointPlayer2 | initialGamePointPlayer1 | initialGamePointPlayer2 | winPointPlayer1 | winPointPlayer2 | score                    |
      | 6                   | 5                   | 0                       | 0                       | 0               | 2               | Set: 6 - 7 / Game: 0 - 0 |
      | 6                   | 5                   | 0                       | 0                       | 0               | 3               | Set: Player 2 win Match |