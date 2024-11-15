package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;

public class BigTask3App {

    public static void main(String[] args) {
        //hefte planlayicisi
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Include week day:");
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses;watch film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to gym";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "prepare presentation";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "attend meeting";
        schedule[5][0] = "Friday";
        schedule[5][1] = "review weekly tasks";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "relax and enjoy";
        //proses
        while (true) {
            String day = sc.nextLine();
            day = day.toUpperCase().trim();
            if (day.equals("CHANGE MONDAY")||day.equals("CHANGE SUNDAY")||day.equals("CHANGE TUESDAY")||day.equals("CHANGE WEDNESDAY")||day.equals("CHANGE THURSDAY")||day.equals("CHANGE FRIDAY")||day.equals("CHANGE SATURDAY")) {
                System.out.print("Add monday new plan: ");
                schedule[1][1] = sc.nextLine();
            }
            if (day.equals("MONDAY") || day.equals("SUNDAY") || day.equals("EXIT")
                    || day.equals("TUESDAY") || day.equals("WEDNESDAY") || day.equals("THURSDAY") || day.equals("FRIDAY") || day.equals("SATURDAY")) {
                switch (day) {
                    case "SUNDAY":
                        System.out.println(schedule[0][1]);
                        break;
                    case "MONDAY":
                        System.out.println(schedule[1][1]);
                        break;
                    case "TUESDAY":
                        System.out.println(schedule[2][1]);
                        break;
                    case "WEDNESDAY":
                        System.out.println(schedule[3][1]);
                        break;
                    case "THURSDAY":
                        System.out.println(schedule[4][1]);
                        break;
                    case "FRIDAY":
                        System.out.println(schedule[5][1]);
                        break;
                    case "SATURDAY":
                        System.out.println(schedule[6][1]);
                        break;
                }
                if(day.equals("EXIT")) {
                    System.out.print("Closed schedule!");
                    break;
                }
            } else {
                System.out.println("I don't understood.Try again pls: ");
            }
        }
    }
}

