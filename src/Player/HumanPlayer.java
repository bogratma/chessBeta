package Player;

import Abstract.Player;

public class HumanPlayer extends Player {
    public HumanPlayer(boolean whiteSide) {
    this.whiteSide = whiteSide;
    this.humanPlayer = true;
    }
}
