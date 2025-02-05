package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.player.Player;

public class River extends Location {

    public River(Player player) {
        super(player, "River");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
