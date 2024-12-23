package az.edu.turing.ProjectFamilyApp;

public class RoboCat extends Pet implements Foul{

    public RoboCat(String nickName, int age, int trickLevel,String []habits) {
        super(nickName, age, trickLevel,habits);
        setSpecies(Species.ROBO_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Beep-boop! I am a robot cat named " + getNickname() + ".");
    }

    @Override
    public void foul() {
        System.out.println("Beep! I spilled some oil.");
    }
}
