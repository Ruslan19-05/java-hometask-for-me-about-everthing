package az.edu.turing.ProjectFamilyApp;

public class Man extends Human{


    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, Human father, Human mother) {
        super(name, surname, father, mother);
    }

    @Override
    public void greetPet(){
        System.out.println("Hello,"+getPet().getNickname());
    }

}
