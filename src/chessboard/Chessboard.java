package chessboard;

import piece.*;

public class Chessboard {
    private Piece[][] board;
    private Pawn pawn = new Pawn();
    private King king = new King();
    private Knight knight = new Knight();
    private Bishop bishop = new Bishop();
    private Queen queen = new Queen();
    private  Rook rook = new Rook();
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
    public void movePiece(int sourceX, int sourceY, int destinationX, int destinationY){

    }

    /**
     * Отображение доски (псевдографика или иной способ)
     */
    public void displayBoard(){
        String[] mainPiecesWhite = {rook.getSymbol(), knight.getSymbol(), bishop.getSymbol(), queen.getSymbol(),king.getSymbol(),rook.getSymbol(), knight.getSymbol(), bishop.getSymbol()};
        String[] mainPiecesBlack = {rook.getSymbol(), knight.getSymbol(), bishop.getSymbol(), king.getSymbol(),queen.getSymbol(),rook.getSymbol(), knight.getSymbol(), bishop.getSymbol()};
        for(int i=0;i<8;i++) {
            System.out.print(i + 1);
            for (int j = 0; j < 8; j++) {
                if (i == 1 || i == 6) {
                    System.out.print("\t" + pawn.getSymbol());
                }
                else if(i==0){
                    System.out.print("\t" + mainPiecesWhite[j]);
                }
                else if(i==7){
                    System.out.print("\t" + mainPiecesBlack[j]);
                }
                else {
                    if ((i + j) % 2 == 0)System.out.print("\tW");
                    else System.out.print("\tB");
                }
            }System.out.println();
        }
        System.out.println();
        for(int i=97;i<105;i++){
            System.out.print("\t"+(char)i);
        }
    }
}
