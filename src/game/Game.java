package game;

import chessboard.Chessboard;
import player.Player;

public class Game {

    private Chessboard board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player currentPlayer;

    public Game(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Проверка на мат
     */
    public boolean isCheckmate() {
        return false;
    }

    /**
     * Проверка на пат
     */
    public boolean isStalemate() {
        return false;
    }

    /**
     * @return проверка окончена игра или нет.
     */
    public boolean isGameOver() {
        return false;
    }
}
