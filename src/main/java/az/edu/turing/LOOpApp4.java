package az.edu.turing;

import java.util.Scanner;

public class LOOpApp4 {

    public static void main(String[]args){
        //input
        Scanner scanner = new Scanner(System.in);
        int number;
        //prosess
        do{
            System.out.println("enter number : ");
            int number1=scanner.nextInt();
            number=number1;
            System.out.println(number);
        }while(number<0);

        }

    }


