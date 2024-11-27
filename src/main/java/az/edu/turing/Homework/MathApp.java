package az.edu.turing.Homework;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {

        System.out.print("Enter first num:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.print("Enter second num:");
        int b = sc.nextInt();
        mathEbob(b);
        System.out.println("---");
        mathEbob(a);
        System.out.println("****");
    }

    public static void mathEbob(int a) {
        int temp = a;
        for (int j = 2; j < a; j++) {
            if (temp % j == 0) {
                temp = temp / j;
                System.out.println(j);
            }
        }
    }
}
