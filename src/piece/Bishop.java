package piece;

public class Bishop implements Piece{
    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destinationX, int destinationY) {
        return false;
    }

    @Override
    public String getSymbol() {
        return null;
    }
}