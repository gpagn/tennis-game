import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.highfi.gpag.tennisgame.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ManageScoreGameSteps {
    private TennisGame tennisGame;
    private TennisSet tennisSet;
    private ScoreGameManager scoreGameManager;
    private ScoreSetManager scoreSetManager;

    @Given("The game starts with a score of 0 point for the player")
    public void game_starts_with_zero_point() {
        tennisGame = TennisGame.builder()
                .score(Score.builder()
                        .scorePlayer1(0)
                        .scorePlayer2(0)
                        .build())
                .status(TennisGameStatus.PLAY)
                .build();
        scoreGameManager = new ScoreGameManager();
    }

    @Given("The game starts with a score of (\\d+) point for the player1 and a score of (\\d+) point for the player2")
    public void game_starts_with_initial_point(int initialPointPlayer1, int initialPointPlayer2) {
        tennisGame = TennisGame.builder()
                .score(Score.builder()
                        .scorePlayer1(initialPointPlayer1)
                        .scorePlayer2(initialPointPlayer2)
                        .build())
                .status(TennisGameStatus.PLAY)
                .build();
        scoreGameManager = new ScoreGameManager();
        scoreGameManager.checkStatus(tennisGame);
    }

    @Given("The set starts with a score of (\\d+) point for the player1 and a score of (\\d+) point for the player2")
    public void set_starts_with_initial_point(int initialPointPlayer1, int initialPointPlayer2) {

        List<TennisGame> tennisGameList = new ArrayList<>();
        tennisGameList.add(tennisGame);

        tennisSet = TennisSet.builder()
                .score(Score.builder()
                        .scorePlayer1(initialPointPlayer1)
                        .scorePlayer2(initialPointPlayer2)
                        .build())
                .status(TennisSetStatus.PLAY)
                .tennisGameList(tennisGameList)
                .build();
        scoreSetManager = new ScoreSetManager();
        scoreSetManager.checkStatus(tennisSet);
    }


    @Then("the Game score changes to (.*)")
    public void game_score_change(String score) {
        assertThat(scoreGameManager.displayGameScore(tennisGame)).isEqualTo(score);
    }

    @Then("the set score changes to (.*)")
    public void set_score_change(String score) {
        assertThat(scoreSetManager.displaySetScore(tennisSet)).isEqualTo(score);
    }


    @When("player1 win (\\d+) game and player2 win (\\d+) game")
    public void player1WinWinPointPlayerGameAndPlayerWinWinPointPlayerGame(int winPointPlayer1, int winPointPlayer2) {
        for (int i = 0; i < winPointPlayer1; i++) {
            scoreGameManager.addGamePointOnPlayer1(tennisGame);
        }
        for (int i = 0; i < winPointPlayer2; i++) {
            scoreGameManager.addGamePointOnPlayer2(tennisGame);
        }
    }

    @When("player1 win (\\d+) set or player2 win (\\d+) set")
    public void playerWinWinPointPlayerSetOrPlayerWinWinPointPlayerSet(int winPointPlayer1, int winPointPlayer2) {
        for (int i = 0; i < winPointPlayer1; i++) {
            scoreSetManager.addSetPointOnPlayer1(tennisSet);
        }
        for (int i = 0; i < winPointPlayer2; i++) {
            scoreSetManager.addSetPointOnPlayer2(tennisSet);
        }
    }


}
