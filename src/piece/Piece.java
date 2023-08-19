package piece;

public interface Piece {

    /**
     * @param sourceX стартовая позиция по оси X
     * @param sourceY стартовая позиция по оси Y
     * @param destinationX конечная позиция по оси X
     * @param destinationY конечная позиция по оси Y
     * @return валидация на возможность данного хода
     */
    public boolean isValidMove(int sourceX, int sourceY, int destinationX, int destinationY);

    /**
     * @return возвращает строковое представление фигуры (King, Knight ... Pawn,)
     * При помощи такого метода будет проще проводить логирование, валидацию ходов и т.д
     */
    public String getSymbol();

}
