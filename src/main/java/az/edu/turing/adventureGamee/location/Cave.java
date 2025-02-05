package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.player.Player;

public class Cave extends Location{

    public Cave(Player player){
        super(player,"Cave");
    }

    @Override
    public boolean onLocation(){
        return false;
    }
}
