package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task9App {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt();
        double y=sc.nextInt();
        double z=sc.nextInt();
        double f=0;
        if(x<=Math.pow(10,9) && y<=Math.pow(10,9) && z<=Math.pow(10,9)){
            f=x*y*z+x+Math.pow(y,2)+Math.pow(z,3);
        }
        System.out.println(f);
    }
}
