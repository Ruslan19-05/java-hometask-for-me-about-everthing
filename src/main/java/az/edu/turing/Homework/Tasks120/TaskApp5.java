package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;


public class TaskApp5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n>0 && m>0 && n<=100 && m<=100 && k>=0 && k<=1000){
            float a=(float)m/n;
            System.out.printf("%."+k+"f",a);
        }
    }
}

