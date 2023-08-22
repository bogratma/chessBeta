package chessboard;

import piece.*;
import player.Player;

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
    int[][] cords;
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
    public void movePiece(char sourceX, int sourceY, char destinationX, int destinationY, Pawn p , char[][] cords ){
        int sourceMoveIntegerX = (int) sourceX - 96;
        int destinationMoveIntegerX = (int) destinationX - 96;
        int pawnCordsX = p.getX();
        int pawnCordsY = p.getY();
        System.out.println("X is "+ pawnCordsX+" "+ "Y is "+ pawnCordsY);
        if(cords[destinationMoveIntegerX][destinationY] == 'B'){
            p.setX(destinationMoveIntegerX);
            p.setY(destinationY);
            System.out.println("X is "+ pawnCordsX+" "+ "Y is "+ pawnCordsY);
            cords[sourceMoveIntegerX][destinationY] = 'P';
            System.out.print("\t" + cords[destinationMoveIntegerX][destinationY]);
        }else {
            System.out.println("Tab"+cords[destinationMoveIntegerX][destinationY]);
        }

    }

    /**
     * Отображение доски (псевдографика или иной способ)
     */
    public void displayBoard(){
        Player pl = new Player("Vlad","White");
        ArrayList<Pawn> pawn =new ArrayList<Pawn>() ;
        String[] mainPiecesWhite = {rook.getSymbol(), knight.getSymbol(), bishop.getSymbol(), queen.getSymbol(),king.getSymbol(),bishop.getSymbol(), knight.getSymbol(), rook.getSymbol()};
        String[] mainPiecesBlack = {rook.getSymbol(), knight.getSymbol(), bishop.getSymbol(), queen.getSymbol(),king.getSymbol(),bishop.getSymbol(), knight.getSymbol(), rook.getSymbol()};
        char[][] cords = new char[8][8] ;
        for(int i=0;i<8;i++) {
            System.out.print(i + 1);
            for (int j = 0; j < 8; j++) {
                if (i == 1 || i == 6) {
                    pawn.add(new Pawn(i,j,pl));
                    cords[i][j] = 'P';
                    System.out.print("\t" + pawn.get(i-1).getSymbol());

                }
                else if(i==0){
                    System.out.print("\t" + mainPiecesWhite[j]);
                }
                else if(i==7){
                    System.out.print("\t" + mainPiecesBlack[j]);
                }
                else {
                    if ((i + j) % 2 == 0){
                        cords[i][j] = 'W';
                        System.out.print("\tW");
                    }
                    else {
                        cords[i][j] = 'B';
                        System.out.print("\tB");
                    }
                }
            }System.out.println();
        }
        System.out.println();
        for(int i=97;i<105;i++){
            System.out.print("\t"+(char)i);
        }System.out.println();
        movePiece('a',0,'a',2,pawn.get(1),cords);
    }
}
