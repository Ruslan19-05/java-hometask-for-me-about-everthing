package az.edu.turing.ProjectFamilyApp;

public class Woman extends Human{

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, Human father, Human mother) {
        super(name, surname, father, mother);
    }

    @Override
    public void greetPet(){

    }
}
