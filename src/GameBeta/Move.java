package GameBeta;

import Abstract.Piece;
import Abstract.Player;
import GameBeta.Spot;

public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;

    public Move(Player player, Spot start, Spot end) {
        this.player = player;
        this.start = start;
        this.end = end;

    }
    public boolean isCastlingMove(){
        return this.castlingMove;
    }

    public void setCastlingMove(boolean castlingMove) {
        this.castlingMove = castlingMove;
    }
    public enum GameStatus{
    ACTIVE,
    BLACK_WIN,
    WHITE_WIN,
    STALEMATE,
    RESIGNATION,
    }

}

