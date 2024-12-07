package az.edu.turing.Homework.TasksFromEli;

import java.util.Scanner;

public class Task2App {

    public static void main(String []args){

        System.out.print("Enter numbers:");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();

      sumNum(a,b,n);
    }

    public static void sumNum(int a,int b,int n){
            double sum=a;
            int d=0;
            while(n>d){
                sum+=Math.pow(2,d)*b;
                System.out.println(sum);
                d++;
            }
    }
}
