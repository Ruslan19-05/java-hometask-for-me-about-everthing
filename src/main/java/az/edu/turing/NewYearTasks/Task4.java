package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println(findFactorial(number));
        sumNumbers(number);

    }

    public static int findFactorial(int number){

        int factorial=1;

        for(int i=1;i<=number;i++){
            factorial*=i;
        }

        return factorial;
    }

    public static void sumNumbers(int  number){

        int sum=0;

        for(int i=0;i<=number;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}