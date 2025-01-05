package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        checkPrime(number);

    }

    public static void checkPrime(int num){

        int n=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                n++;
            }
        }

        if(n>2){
            System.out.println("Number is not prime!");
        }else{
            System.out.println("Number is prime!");
        }

    }
}
