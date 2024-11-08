package az.edu.turing;

import java.util.Scanner;

public class LoopApp3 {

    public static void main(String[]args){
        //input
        System.out.println("Enter a number : ");
        Scanner scanner =new Scanner(System.in);
        int mon=scanner.nextInt();
        int age=0;
                for (int i=0;i<=age;i++){
                    i=mon-mon*2;
                    age=i;
                }
                System.out.print(age);

    }
}
