package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.player.Player;

public class SafeHouse extends Location {

    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation(){
        return false;
    }
}
