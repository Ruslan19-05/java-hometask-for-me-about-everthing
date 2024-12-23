package az.edu.turing.ProjectFamilyApp;

public class Fish extends Pet{

    public Fish(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.println("I am a fish. Blub blub!");

    }
}
