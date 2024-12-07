package az.edu.turing.Homework.TasksFromEli;

import java.util.Scanner;

public class Task4App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        double y;


        y=  ((Math.pow(x,2)+3*x-4)/(2*x-3) - (x+2)/(Math.pow(x,2)-5*x+7));
        System.out.printf("%.3f",y);

    }
}
