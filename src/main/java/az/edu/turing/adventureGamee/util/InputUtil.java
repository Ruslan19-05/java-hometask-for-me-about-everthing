package az.edu.turing.adventureGamee.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    public static final Scanner scanner = new Scanner(System.in);

    public static String getText(String title) {

        System.out.print(title + ":");
        return scanner.nextLine();
    }

    public static Integer getInteger(String title) {

        while(true) {
            System.out.print(title + ":");

            try {
                int value=scanner.nextInt();
                scanner.nextLine();
                return value;

            } catch (InputMismatchException ex) {
                System.out.println("Invalid input,enter integer value!");
                scanner.nextLine();
            }
        }








































































    }
}
