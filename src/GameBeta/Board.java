package GameBeta;

import GameBeta.Spot;
import Pieces.King;
import Pieces.Knight;
public class Board {

    Spot[][] boxes;

    public Board(){
        boxes[0][0] = new Spot(0,0,new Knight(true));
        System.out.println(boxes);
        this.resetBoard();
    }

    public Spot getBox(int x,int y)  {
        if(x<0 || x>7 || y<0 || y>7){
            System.out.println("err");
        }
        return boxes[x][y];
    }


    public void resetBoard(){
        for(int i=0;i<8;i++){
            System.out.print(i+1);
            for(int j=0;j<8;j++){
                if(i<2 || i>5){
                    boxes[i][j] = new Spot(i,j,new Knight(true));
                 System.out.print(" p ");
                }
                else System.out.print(" * ");
            }System.out.println();
        }
        for(int i=97;i<105;i++){
            System.out.print("  "+ (char)i);
        }
        //DESCRIPTION FOR PIECES//
//        for(int i = 2; i < 6; i++){
//            for(int j = 0; j < 8; j++){
//                boxes[i][j] = new Spot(i, j, null);
//            }
//        }
    }
    public void Check(){
        System.out.println("Check");
    }
}
