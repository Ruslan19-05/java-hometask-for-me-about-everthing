package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task8App {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double x= sc.nextInt();
        double f = 0;
        
        if(x<=Math.pow(10,9)){
            f=1+x+(Math.pow(x,2));
        }
        System.out.print(f);
    }
}
