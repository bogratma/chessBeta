package piece;

public class Rook implements Piece{
    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destinationX, int destinationY) {
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
