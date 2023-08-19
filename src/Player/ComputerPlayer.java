package Player;

import Abstract.Player;

public class ComputerPlayer extends Player {
    public ComputerPlayer(boolean whiteSide) {
        this.whiteSide = whiteSide;
        this.humanPlayer = false;
    }

}
