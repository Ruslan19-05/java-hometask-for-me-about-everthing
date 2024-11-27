package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task1App {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= Math.pow(10, 8) && b <= Math.pow(10, 8) && c <= Math.pow(10, 8)) {

            if (a + b + c == 2020) {
                System.out.println(a + "+" + b + "+" + c);
            } else if (a + b - c == 2020) {
                System.out.println(a + "+" + b + "-" + c);
            } else if (a - b + c == 2020) {
                System.out.println(a + "-" + b + "+" + c);
            } else if (a - b - c == 2020) {
                System.out.println(a + "-" + b + "-" + c);
            } else if (-a + b + c == 2020) {
                System.out.println("-" + a + "+" + b + "+" + c);
            } else if (-a + b - c == 2020) {
                System.out.println("-" + a + "+" + b + "-" + c);
            } else if (-a - b + c == 2020) {
                System.out.println("-" + a + "-" + b + "+" + c);
            } else if (-a - b - c == 2020) {
                System.out.println("-" + a + "-" + b + "-" + c);
            } else {
                System.out.println("CORONA");
            }
        }
    }
}