package az.edu.turing.game.adventure;

import java.util.Scanner;

public class Game {

    public static void start(){
        System.out.println("\n\t\t\tWelcome to the Adventure Game!");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=scanner.nextLine();
        System.out.printf("Enter the name %s,Everything is real you see here!",name);

    }
}
