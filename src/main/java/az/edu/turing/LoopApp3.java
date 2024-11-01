package az.edu.turing;

import java.util.Scanner;

public class LoopApp3 {

    public static void main(String[]args){
        //input
        System.out.println("Enter a number : ");
        Scanner scanner =new Scanner(System.in);
        int sum=0;
        //prosess
        while(true) {
            System.out.println("enter teh number : ");
            int number1 = scanner.nextInt();
                if(number1==0){
                    break;
                }
                sum+=number1;
        }
        //output
        System.out.println(sum);


    }
}
