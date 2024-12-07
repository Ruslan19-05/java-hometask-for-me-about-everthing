package az.edu.turing.Homework.TasksFromEli;

import java.util.Scanner;

public class Task5App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        checkNum(n);
    }

    public static void checkNum(int n){
        if(n%2==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
