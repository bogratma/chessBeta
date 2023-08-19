package GameBeta;

import Abstract.Player;
import GameBeta.Board;
import GameBeta.Move;
import GameBeta.Spot;

import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private Move.GameStatus status;
    private List<Move> movesPlayed;

    public void initialize(Player p1, Player p2){
    players[0] = p1;
    players[1] = p2;
    board.resetBoard();
    if(p1.isWhiteSide()){
        this.currentTurn = p1;
    }
    else {
        this.currentTurn = p2;
    }
    movesPlayed.clear();
    }
    public  boolean isEnd(){
        return this.getStatus() != Move.GameStatus.ACTIVE;
    }
    public Move.GameStatus getStatus(){
        return this.status;
    }

    public void setStatus(Move.GameStatus status) {
        this.status = status;
    }
    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) throws Exception {
        Spot startBox = board.getBox(startX,startY);
        Spot endBox = board.getBox(startY, endY);
        Move move = new Move(player, startBox, endBox);
        //return this.makeMove(move,player);
        return true;
    }

}

