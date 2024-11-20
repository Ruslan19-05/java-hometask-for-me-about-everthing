package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class TaskApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numberOfDigits = 0;

        do {
            numberOfDigits++;
            n /= 10;
        } while (n > 0);

        System.out.println(numberOfDigits);
    }

//    public static void digit(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        int digitsCount = String.valueOf(number).length();
//
//        System.out.println(digitsCount);
//    }
}
