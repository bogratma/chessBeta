package piece;

import player.Player;

public class Pawn implements Piece{
    private int x,y;
    Player pl;

    public Pawn(int x, int y, Player pl) {
        this.x = x;
        this.y = y;
        this.pl = pl;
    }

    public Pawn() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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
