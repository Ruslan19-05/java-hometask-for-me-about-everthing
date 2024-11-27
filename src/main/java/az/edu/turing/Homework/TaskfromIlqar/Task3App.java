package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task3App {

    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int x=sc.nextInt();
        double y;
        y=x-(Math.pow(x,2)+4)/2 + Math.pow(x,3)-((double) 3 /(x+7));
        System.out.println(y);
    }
}
