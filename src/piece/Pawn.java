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

    public void checkinfo (){
        System.out.println("По Горизонтали "+getX()+" По Вертикали "+ getY()+" Игрок "+pl.getColor());
    }

    public String getPl() {
        return pl.getColor();
    }

    @Override
    public boolean isValidMove(int sourceX, int sourceY, int destinationX, int destinationY) {
        if(Math.abs(destinationX-sourceX) ==1 && Math.abs(destinationY-sourceY)==0)
            return true;
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
