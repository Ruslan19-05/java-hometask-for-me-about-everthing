package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task5App {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        double y;

        y=2*x/Math.sqrt((Math.pow(x,2)+1))-Math.sqrt((Math.pow(x,2)+1))/Math.pow(x,3);
        System.out.printf("%.3f",y);

    }
}
