package az.edu.turing.Homework;

import java.util.Scanner;

public class CostomerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name:");
        String name = scanner.nextLine();

        System.out.print("Enter surname:");
        String surname = scanner.nextLine();

        System.out.print("Enter gender:");
        String gender = scanner.nextLine();
        gender = gender.toLowerCase();

        if (gender.equals("male") || gender.equals("female")) {
        } else {
            System.out.print("Wrong gender!\n" + "Try again pls:");
            gender = scanner.nextLine();
        }

        System.out.print("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age > 0) {
            if (age < 18) {
                System.out.print("You are younger for anket!\n" + "Try again,pls:");
                age = scanner.nextInt();
                scanner.nextLine();
            } else if (age > 99) {
                System.out.print("You are older for anket!\n" + "Try again ,pls:");
                age = scanner.nextInt();
                scanner.nextLine();
            }
        }else{
            System.out.print("Wrong age!\n"+"Try again,Pls:");
            age=scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Enter Universty:");
        String universty = scanner.nextLine();

        Costomer buyer = new Costomer(name, surname, gender, age, universty);
        System.out.print("Enter code:");
        int code = scanner.nextInt();
        if (code == 1) {
            System.out.print("Enter new age:");
            int newage = scanner.nextInt();
            scanner.nextLine();
            buyer.changeAge(newage);
        }
        if (code == 2) {
            System.out.print("New Universty:");
            scanner.nextLine();
            String changeuni = scanner.nextLine();
            buyer.changeUni(changeuni);
        }else if(code==3){
            System.out.print("Change Gender:");
            scanner.nextLine();
            String newGen=scanner.nextLine();
            buyer.changeGen(newGen);
        }
    }
}
