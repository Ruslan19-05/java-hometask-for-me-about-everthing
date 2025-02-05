package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.player.Player;

public class ToolStore extends Location{

    public ToolStore(Player player) {
        super(player, "ToolStore");
    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
