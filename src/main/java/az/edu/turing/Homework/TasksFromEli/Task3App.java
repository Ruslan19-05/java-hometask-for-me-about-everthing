package az.edu.turing.Homework.TasksFromEli;

import java.util.Scanner;

public class Task3App {

    public static void main(String []args) {

        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        while(n>0){
            n-=sumN(n);
            count++;
        }

        System.out.println(count);


    }

    public static int sumN(int n){
        int a;
        int sum = 0;

        while (n > 0) {
            a = n % 10;
            sum += a;
            n /= 10;
        }
        return sum;
    }
}
