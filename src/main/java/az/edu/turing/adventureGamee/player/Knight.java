package az.edu.turing.adventureGamee.player;

public class Knight extends Player{

    public Knight() {
        super(3, "Knight", 6, 30, 22);
    }

    @Override
    public String toString(){
        return "Knight -->"+super.toString();
    }
}
