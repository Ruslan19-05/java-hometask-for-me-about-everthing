package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.player.Player;

public abstract class Location {

    private Player player;
    private String name;

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean onLocation();
}
