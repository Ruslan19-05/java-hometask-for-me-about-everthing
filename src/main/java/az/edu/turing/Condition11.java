package az.edu.turing;

import java.util.Scanner;

public class Condition11 {

    public static void main(String[] args) {
        //input
        //fəsilləri verin
        System.out.println("Enter your month: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        //prosess
        if (number <= 12) {
            if (number >= 3 && number <= 5) {
                result = ("Spring");
            } else if (number >= 6 && number <= 8) {
                result = ("Summer");
            } else if (number >= 9 && number <= 11) {
                result = ("Autumn");
            } else
                result = ("Winter");
            if (number >= 13) {
                System.out.println("Not has this month");
            }
            //output
            System.out.print(result);

        }
    }
}