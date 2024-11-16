package az.edu.turing.Homework;

import java.util.Scanner;

public class MethodsFactorial5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        int fact=findfactorial(a);
    }

    public static int findfactorial(int a) {
        int b=1;
        for(int i=1;i<=a;i++){
            b*=i;
        }
        System.out.print(a+" Fcatorials: "+b);
        return a;
    }
}
