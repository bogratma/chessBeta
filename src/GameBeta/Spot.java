package GameBeta;

import Abstract.Piece;

public class Spot {
    private Abstract.Piece Piece ;
    private int x;
    private int y;

    public Spot( int x, int y, Piece piece) {
        Piece = piece;
        this.x = x;
        this.y = y;
    }

    public void setPiece(Piece piece) {
        Piece = piece;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piece getPiece() {
        return Piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
