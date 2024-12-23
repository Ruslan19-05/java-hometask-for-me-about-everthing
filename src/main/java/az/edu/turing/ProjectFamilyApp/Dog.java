package az.edu.turing.ProjectFamilyApp;

public class Dog extends Pet implements Foul{

    public Dog(String nickName, int age, int trickLevel,String[] habits) {
        super(nickName, age, trickLevel,habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond(){
        System.out.println("Woof! Woof! I am your loyal dog.");
    }

    @Override
    public void foul(){
            System.out.println("Dog made a mess in the garden!");
    }
}
