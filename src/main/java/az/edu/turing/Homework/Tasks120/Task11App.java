package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Task11App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long sum = 0;
        int n = 0;
        long temp = number;
        while (temp > 0) {
            while (number > 0) {
                sum = sum + number % 10;
                number /= 10;
                n++;
            }
            //System.out.println(sum);
            temp = temp - sum;
            number=temp-sum;
        }
        System.out.println(n-1);
    }
}

