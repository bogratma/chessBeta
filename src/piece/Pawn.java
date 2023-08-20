package piece;

public class Pawn implements Piece{
    private int x,y;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pawn() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destinationX, int destinationY) {
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
