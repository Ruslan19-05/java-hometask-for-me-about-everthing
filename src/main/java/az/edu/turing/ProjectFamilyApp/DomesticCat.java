package az.edu.turing.ProjectFamilyApp;

public class DomesticCat extends Pet implements Foul{

    public DomesticCat(String nickName, int age, int trickLevel,String []habits) {
        super(nickName, age, trickLevel,habits);
        setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am a domestic cat named " + getNickname() + ".");
    }

    @Override
    public void foul() {
        System.out.println("Cat scratched the furniture!");
    }
}
