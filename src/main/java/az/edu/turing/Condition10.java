package az.edu.turing;

import java.util.Scanner;

public class Condition10 {

    public static void main(String[]args){
        //input
        System.out.println("Enter the tringle side: ");
        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        //proses
        if(number1<=1000 && number2<=1000 && number3<=1000){
            if(number1>number2 && number1>number3){
                if(number1*number1==(number2*number2 + number3*number3)) {
                    System.out.println("YES");
                }else
                    System.out.println("NO");

            }else if(number2>number1 && number2>number3){
                if(number2*number2==(number1*number1 + number3*number3)){
                    System.out.println("YES");
                }else
                    System.out.println("NO");
            }else
                if(number3*number3==(number2*number2 +number1*number1)){
                    System.out.println("YES");
                }else
                    System.out.println("NO");
        }

    }
}
