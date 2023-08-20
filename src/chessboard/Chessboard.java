package chessboard;

import piece.Piece;

public class Chessboard {
    private Piece[][] board;

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
        for(int i=0;i<8;i++){
            System.out.print(i+1);
            for(int j=0;j<8;j++){
                if(i<2 || i>5){
                    System.out.print("\tP");
                }
                else {
                    System.out.print("\t*");
                }
            }System.out.println();
        }
        System.out.println();
        for(int i=97;i<105;i++){
            System.out.print("\t"+(char)i);
        }
    }
}
