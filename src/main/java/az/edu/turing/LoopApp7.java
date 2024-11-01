package az.edu.turing;

import java.util.Scanner;

public class LoopApp7 {

    public static void main(String[]args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=0;
        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Number is positive");
                System.out.println("Enter number again: ");
            } else if (number < 0) {
                System.out.println("Number is negative");
                System.out.println("Enter number again: ");
            } else
                break;
            n++;
        }
        System.out.print("Number count: "+n);
    }
}
