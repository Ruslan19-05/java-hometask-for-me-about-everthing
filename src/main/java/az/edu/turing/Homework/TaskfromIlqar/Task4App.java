package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task4App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y;

        y=(2*x-1)/(Math.pow(x,2))+Math.sqrt((Math.pow(x,2)+1))/2;

        System.out.printf("%.3f",y);
    }
}
