package start;

import chessboard.Chessboard;
import game.Game;
import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chessboard board = new Chessboard();

        Player white = new Player("Player One", "White");
        Player black = new Player("Player Two", "Black");

        Game game = new Game(white, black);

        board.displayBoard();

        while (!game.isGameOver()) {
            Player currentPlayer = game.getCurrentPlayer();

            // Добавь логирование и вывод ходов игроку.
            String move = getUserInput();

            // Допиши реализацию цикла игры.
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
}