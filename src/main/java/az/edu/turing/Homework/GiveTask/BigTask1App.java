package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;
import java.util.Random;

public class BigTask1App {

    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Let the game begin!");
        System.out.print("Name:");
        String name=sc.nextLine();
        int number=sc.nextInt();
        int randomnumber=random.nextInt(100);
        //prosess
        while(true) {
            if (number < randomnumber) {
                System.out.println("Your number is too samall.Please,try again..");
                number = sc.nextInt();
            } else if (number > randomnumber) {
                System.out.println("Your number is too big.Please try agin..");
                number = sc.nextInt();
            } else {
                System.out.println("Conguratulations,"+name);
                break;
            }
        }
    }
}
