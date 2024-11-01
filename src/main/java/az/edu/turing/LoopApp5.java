package az.edu.turing;

import java.util.Scanner;

public class LoopApp5 {

    public static void main(String[]args){
        //input
        System.out.println("Enter number pls: ");
        Scanner scanner =new Scanner(System.in);
        int number= scanner.nextInt();
        System.out.println("antill to number: ");
        for(int a=1;a<number;a--){
            if(number<5){
                System.out.println("Daxil edilən ədəd 5-dən kiçikdir");
            }
            if(a==-30){
                break;
            }
            System.out.print(a+" ");

        }

    }
}
