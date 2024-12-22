package az.edu.turing.ProjectFamilyApp;

public class Woman extends Human{

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, Human father, Human mother) {
        super(name, surname, father, mother);
    }

    public Woman(String name,String surname){
        super(name,surname);
    }

    @Override
    public void greetPet(){
        System.out.println("Hello my lovely pet!");
    }

    public void makeUp(){
        System.out.println("Doing makeup...");
    }
}
