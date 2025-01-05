package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for main:");
        double a=sc.nextDouble();
        System.out.println("Enter number for power:");
        double b=sc.nextDouble();

        powerSolving(a,b);

    }

    public static void powerSolving(double number1,double number2){

        System.out.println(Math.pow(number1,number2));
        System.out.println(number1/number2);
    }
}
