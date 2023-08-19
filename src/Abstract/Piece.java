package Abstract;

import GameBeta.Board;
import GameBeta.Spot;

public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;
    public char symbol;

    public Piece(boolean white) {
        this.setWhite(white);
    }
    public boolean isWhite(){
        return this.white;
    }
    public boolean isKilled(){
        return this.killed;
    }
    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public abstract boolean canMove(Board board, Spot start, Spot end);
}
