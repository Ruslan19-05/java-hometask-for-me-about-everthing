package az.edu.turing.adventureGamee.player;

public class Archer extends Player{

    public Archer() {
        super(2,"Archer",6,25,20);
    }

    @Override
    public String toString(){
        return "Archer -->"+super.toString();
    }
}
