package az.edu.turing.adventureGamee.location;

import az.edu.turing.adventureGamee.player.Player;

public class Forest extends Location{

    public Forest(Player player){
        super(player,"Forest");
    }

    @Override
    public boolean onLocation(){
        return false;
    }
}
