package az.edu.turing.ProjectFamilyApp;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Human human=new Man("Qalkiper","QUMBARA",1901);
        Human human2=new Woman("Zuarefe","CEKICAN",1902);

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

        System.out.println(human);
        System.out.println(human2);
    }
}
