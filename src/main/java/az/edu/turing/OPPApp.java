package az.edu.turing;

import java.util.Scanner;

public class OPPApp {

    public static void main(String[] args) {


        System.out.println("*************WELCOME APPLICATION***************");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Number:");
            int no = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your Name:");
            String name = sc.nextLine();

            System.out.print("Enter your Surname:");
            String surname = sc.nextLine();

            System.out.print("Enter your expirance in this job: ");
            int practic = sc.nextInt();

            System.out.print("Enter your salary which you want:");
            double salary = sc.nextDouble();
            OPP opp = new OPP(no, name, surname, practic, salary);

            String operation = "1-works infomation showing\n"
                    + "2 times icrease salaray\n" + "3 updates operating sytsem";

            System.out.println("--------------------------------------");
            System.out.println(operation);
            System.out.println("Make your choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    opp.clisianBilgiler();
                    break;
                case 2:
                    System.out.print("Value of increase salary:");
                    int zam = sc.nextInt();
                    opp.increaceSalary(zam);
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("Who do it formating:");
                    String man = sc.nextLine();
                    String operatingSystem = sc.nextLine();
                    opp.formatdo(operatingSystem, man);
                    break;
                default:
                    System.out.print("Wrong number ,try again pls!");
            }
            String exit=sc.nextLine();
            if(exit.equals("exit")){
                break;
            }
        }


    }
}
