package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Hard6App {

    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter containers:");
            String contain=scanner.nextLine();
            String [] c={"(",")","{","}","[","]"};
            for(int i=0;i<contain.length();i++){
                if(contain.equals(c[0])){
                    if(contain.equals(c[1])){
                        System.out.print("True");
                    }
                }
            }
    }
}
