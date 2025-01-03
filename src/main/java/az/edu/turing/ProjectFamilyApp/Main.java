package az.edu.turing.ProjectFamilyApp;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] dogHabits={"running","Barking","Biting someone"};
        Pet dog=new Dog("Bobik",2,80,dogHabits);
        Human mother=new Human("Nigar","Sultanova",1990);
        Human father=new Human("Veli","Ehmedov",1988);
        Family family = new Family(mother, father);


        String[] schedule = new String[DayOfWeek.values().length];

        schedule[DayOfWeek.MONDAY.ordinal()] = "Work on the project";
        schedule[DayOfWeek.TUESDAY.ordinal()] = "Attend team meetings";
        schedule[DayOfWeek.WEDNESDAY.ordinal()] = "Go to the gym";
        schedule[DayOfWeek.THURSDAY.ordinal()] = "Study new topics";
        schedule[DayOfWeek.FRIDAY.ordinal()] = "Watch a movie";
        schedule[DayOfWeek.SATURDAY.ordinal()] = "Spend time with family";
        schedule[DayOfWeek.SUNDAY.ordinal()] = "Rest and relax";

        System.out.println("Weekly Schedule:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.name() + ": " + schedule[day.ordinal()]);
        }

        System.out.println(mother);
        System.out.println(father);

        String[] fishHabits={"swim","eating"};
        Pet fish=new Fish("Neon",5,95,fishHabits);

        dog.getHabits();
        dog.respond();
        dog.eat();

        fish.getHabits();
        fish.respond();
        fish.eat();
        dog.respond();
        father.greetPet();
        mother.describePet();

        System.out.println( family.countFamily());

        System.out.println(dog instanceof Foul) ;
            ((Foul) dog).foul();

    }
}
