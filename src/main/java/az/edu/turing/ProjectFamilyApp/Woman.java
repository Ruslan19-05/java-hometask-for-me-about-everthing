package az.edu.turing.ProjectFamilyApp;

public class Woman extends Human{

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int year, int iq, DayOfWeek[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet(){
        System.out.println("Hello my lovely pet!");
    }

    public void makeUp(){
        System.out.println("Doing makeup...");
    }
}
