package Rooms;

import Game.Runner;
import People.Person;

public class GameOverRoom extends Room{

    public GameOverRoom(int x, int y) {
        super(x, y);

    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You fell into a pit after entering the room and died.");
        Runner.gameOff();
    }


}