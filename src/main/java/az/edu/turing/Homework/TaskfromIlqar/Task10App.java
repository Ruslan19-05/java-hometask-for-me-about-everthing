package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task10App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double k = sc.nextDouble();
        int n = 1;
        int num = 3;
        int sum = 0;

        if (k <= Math.pow(10, 8)) {
            while (true) {

                if (k %num  == 0) {
                    sum += num;
                    n++;
                    break;
                } else {
                    num++;
                    n++;
                }
            }
            System.out.println(n);
        }
    }
}
