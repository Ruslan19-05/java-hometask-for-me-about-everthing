package az.edu.turing.Homework;

import java.util.Scanner;

public class ColcuratorApp {

    public static void main(String[] args) {
        System.out.println("-------------Welcome My Calculator--------------");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter first number:");
            long number1 = sc.nextLong();
            System.out.print("Enter second number:");
            long number2 = sc.nextLong();
            System.out.print("Which you do operation?:");
            char operation = sc.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = number1 + number2;
                    System.out.println("Result:" + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("Result:" + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("Result:" + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = (double) number1 / number2;
                        System.out.println("Reslut:" + result);
                    } else {
                        System.out.println("Sıfıra bölmə yoxdur!");
                    }
                    break;
                default:
                    System.out.println("Düzgün olmayan operator daxil etməmisiz!");
            }
            System.out.println("do you exit?");
            String exit=sc.nextLine();
            sc.nextLine();
            if(exit.equalsIgnoreCase("Yes")){
                return;
            }
        }
    }
}
