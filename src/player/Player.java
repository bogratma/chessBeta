package player;

import chessboard.Chessboard;

public class Player {
    private final String name;
    private final String color;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * @param board шахматная доска
     * @param sourceX стартовая позиция по оси X
     * @param sourceY стартовая позиция по оси Y
     * @param destinationX конечная позиция по оси X
     * @param destinationY конечная позиция по оси Y
     * @return булево значение (совершен ли ход)
     */
    public boolean makeMove(Chessboard board, int sourceX, int sourceY, int destinationX, int destinationY){
        return false;
    }

}
