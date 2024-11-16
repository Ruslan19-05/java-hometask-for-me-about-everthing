package az.edu.turing.Homework;

import java.util.Scanner;

public class MethodsPrime4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int simple = prime(a);
    }

    public static int prime(int a) {
        int n = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                n++;
            }
        }
        if (n > 2) {
            System.out.println(a + " Not Prime number");
        } else {
            System.out.println(a + " Number is Prime");
        }
        return a;
    }
}