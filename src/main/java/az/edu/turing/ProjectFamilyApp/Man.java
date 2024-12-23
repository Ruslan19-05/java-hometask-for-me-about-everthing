package az.edu.turing.ProjectFamilyApp;

public class Man extends Human{


    public Man(String name, String surname, int year, int iq, DayOfWeek[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet(){
        System.out.println("Hello,"+getPet().getNickname());
    }

    public void repairCar(){
        System.out.println("Fixing the car...");
    }

}
