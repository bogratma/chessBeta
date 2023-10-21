package start;

import chessboard.Chessboard;
import game.Game;
import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Chessboard board = new Chessboard();

        Player white = new Player("Player One", "White");
        Player black = new Player("Player Two", "Black");

        Game game = new Game(white, black);

        board.displayBoard();

        while (!game.isGameOver()) {
            board.setMoveX(sc.nextInt());
            board.setMoveY(sc.nextInt());
            board.setDestX(sc.nextInt());
            board.setDestY(sc.nextInt());
            board.makemovtest();
            // Player currentPlayer = game.getCurrentPlayer();

            // Добавь логирование и вывод ходов игроку.
           // String move = getUserInput();

            // Допиши реализацию цикла игры.
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }
    public void getUserInp(int sourceX,int sourceY,int destX,int destY){

    }
}