package chessboard;

import piece.*;
import player.Player;
import java.util.Scanner;
import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    private Piece[][] board;

    private King king = new King();
    private Knight knight = new Knight();
    private Bishop bishop = new Bishop();
    private Queen queen = new Queen();
    private  Rook rook = new Rook();
    public ArrayList<Pawn> pawn =new ArrayList<Pawn>() ;

    public int moveX = 0;
    public int moveY = 0;
    public int destX = 0;
    public int destY = 0;
   public char[][] cords = new char[8][8];

    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }

    public void setDestX(int destX) {
        this.destX = destX;
    }

    public void setDestY(int destY) {
        this.destY = destY;
    }

    public Chessboard() {

    }

    /**
     * Метод передвигает фигуру
     *
     * @param sourceX стартовая позиция по оси X
     * @param sourceY стартовая позиция по оси Y
     * @param destinationX конечная позиция по оси X
     * @param destinationY конечная позиция по оси Y
     */

    /**
     * Отображение доски (псевдографика или иной способ)
     */
    public void displayBoard(){
        Player pl = new Player("Vlad","White");
        Player pl1 = new Player("Vlad1","Black");

        //String[] mainPiecesWhite = {rook.getSymbol(), knight.getSymbol(), bishop.getSymbol(), queen.getSymbol(),king.getSymbol(),bishop.getSymbol(), knight.getSymbol(), rook.getSymbol()};
        //String[] mainPiecesBlack = {rook.getSymbol(), knight.getSymbol(), bishop.getSymbol(), queen.getSymbol(),king.getSymbol(),bishop.getSymbol(), knight.getSymbol(), rook.getSymbol()};

        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 1 ) {
                    pawn.add(new Pawn(i,j,pl));
                    cords[i][j] = 'P';
                }
                else if (i==6){
                    pawn.add(new Pawn(i,j,pl1));
                    cords[i][j] = 'P';
                }
                else {
                    if ((i + j) % 2 == 0){
                        cords[i][j] = 'W';
                    }
                    else {
                        cords[i][j] = 'B';
                    }
                }
            }
        }
        RenderBoard(cords);


    }
public void RenderBoard(char[][] cords){
    for(int i=0;i<8;i++) {
        System.out.print(i);
        for (int j = 0; j < 8; j++) {
            System.out.print("\t"+cords[i][j]);
        }System.out.println();
    }
    System.out.println();
    for(int i=97;i<105;i++){
        System.out.print("\t"+(char)i);
    }System.out.println();
}
public void makemovtest(){

    for(int i=0;i<16;i++){
        if(moveX==pawn.get(i).getX() && moveY==pawn.get(i).getY()) {
            if(pawn.get(i).isValidMove(moveX,moveY,destX,destY)){
                pawn.get(i).setX(destX);
                pawn.get(i).setY(destY);
                cords[destX][destY]='P';
                if((destX+destY)%2==1)cords[moveX][moveY]='W';
                else if((destX+destY)%2!=1)cords[moveX][moveY]='B';
            }
            break;
        }
    }
    RenderBoard(cords);
}
}
